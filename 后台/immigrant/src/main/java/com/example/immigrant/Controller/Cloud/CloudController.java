package com.example.immigrant.Controller.Cloud;



import com.example.immigrant.domain.Cloud.Cloud;
import com.example.immigrant.domain.Cloud.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Cloud")
public class CloudController {
    @Autowired
    private com.example.immigrant.Repository.Cloud.CloudRepository CloudRepository;
    @Autowired
    private com.example.immigrant.Repository.Cloud.TitleRepository TitleRepository;
    //输出词云表所有结果
    @GetMapping(value = "/all")
    public List<Cloud> CloudList(){
        return CloudRepository.findAll();
    }
    //输出标题表所有结果
    @GetMapping(value = "/all/title")
    public List<Title> TitleList(){
        return TitleRepository.findAll();
    }
    //根据标题表titel输出结果
    @GetMapping(value = "/Title/{title}")
    public List<Title> TitleListBytitle(@PathVariable("title") String title){
        return TitleRepository.findByTitle(title);
    }
    //根据标题表titel部分内容输出结果
    @GetMapping(value = "/title/{title}")
    public List<Title> TitleListBytitleContaining(@PathVariable("title") String title){
        return TitleRepository.findByTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContaining(" "+title+" "," "+title+","," "+title+":","\""+title+" ","\""+title+"\""," "+title+"\""," "+title+"\\","\\"+title+" "," "+title+"s "," "+title+"s,"," "+title+"s:","\""+title+"s ","\""+title+"s\""," "+title+"s\""," "+title+"s\\","\\"+title+"s ");
    }
}
