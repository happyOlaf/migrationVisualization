(function($){

    $.fn.pagination = function(options){
        var defaults = {
            /*总页数*/
            total: 0,
            /*每页条数*/
            row: 10,
            /*最大页码量,调这个值分页页码数量会变化*/
            num: 2,
            /*当前页索引*/
            current: 1,
            /*
                自定义分页模板
                first, last, prev, next 请保证 data-index 值正确否则click事件无响应
                item 必须有，其它可选
            */
            template: {
                first:'<li class="first" data-index="first"><a href="javascript:;">首页</a></li>',
                last: '<li class="last" data-index="last"><a href="javascript:;">最后一页</a></li>',
                prev: '<li class="prev" data-index="prev"><a href="javascript:;">上一页</a></li>',
                next: '<li class="next" data-index="next"><a href="javascript:;">下一页</a></li>',
                ellipsis: '<li class="ellipsis" data-index="ellipsis"><a href="javascript:;">...</a></li>',
                item: '<li class="page-{{dataIndex}}" data-index="{{dataIndex}}"><a href="javascript:;">{{index}}</a></li>',
                wrapElement: 'ul'
            },
            /*回调 $.noop.call(this, current, context);*/
            onJump: $.noop
        };

        function Pager(){
            return this.init.apply(this, arguments);
        }

        Pager.prototype = {
            init: function(opt, context){
                if(!opt.template || !opt.template.item){
                    throw new  Error("`item` cannot be empty!");
                }
                this.config   = opt || {};
                this.template      = opt.template;
                this.$context = $(context);
                this.total    = opt.total;
                this.row      = opt.row;
                this.num      = opt.num;
                this.current  = opt.current;
                this.onJump   = opt.onJump;
                this.render();
                this.bindEvent();
            },
            bindEvent: function(){
                var self = this;
                var tag  = this.template.item.match(/\<(\w+)/)[1];

                function clickHandler(){
                    var $this = $(this), index = $this.data('index');
                    if(index === 'current' || index == 'ellipsis')return;
                    switch(index){
                        case 'prev'  : self.current--; break;
                        case 'next'  : self.current++; break;
                        case 'last'  : self.current = self.page; break;
                        case 'first' : self.current = 1; break;
                        default: self.current = index*1;
                    }
                    self.onJump.call(this, self.current, self);
                    self.render();
                }
                this.$context.on('click', tag, clickHandler)
            },
            fixParams: function(){
                this.page    = Math.ceil(this.total/this.row);
                this.num     = Math.min(this.page-1, this.num);
                this.current = Math.min(Math.max(this.current, 1), this.page);
            },
            render: function(){
                this.fixParams();
                var code  = [], 
                    cur   = this.current, 
                    start = Math.max(1, cur-this.num), 
                    end   = start + this.num;

                if(start > 2){
                    code.push(this.template.first || "");
                    code.push(this.template.prev  || "");
                    code.push(this.getItemPageHtml(1));
                    code.push(this.template.ellipsis || "");
                }else if(start == 2){
                    code.push(this.getItemPageHtml(1));
                }

                for(var i = start; i <= end; i++){
                    code.push(this.getItemPageHtml(i));
                }

                end < this.page-1 && code.push(this.template.ellipsis || "");

                if(end < this.page){
                    code.push(this.getItemPageHtml(this.page));
                    code.push(this.template.next || "");
                    code.push(this.template.last || "");
                }

                if(this.template.wrapElement){
                    code.unshift('<' + this.template.wrapElement + '>');
                    code.push('</' + this.template.wrapElement + '>');
                }
                this.$context.html( code.join('') );
            },
            getItemPageHtml: function(index){
                var self = this;
                var obj = {
                    index: function(){ return index; },
                    dataIndex: function(){
                        return index === self.current ? 'current' : index;
                    }
                };
                return self.template.item.replace(/\{\{(\w+)\}\}/g, function(a, key){
                    return obj[key]();
                });
            }
        };

        this.each(function(){
            var $pagination = $(this).data('pagination');
            if($pagination){
                $.extend($pagination, $.extend($pagination.config, options));
                $pagination.render();
            }else{
                $(this).data('pagination', new Pager($.extend(defaults, options), this));
            }
        });

        return this;
    };

}(jQuery));