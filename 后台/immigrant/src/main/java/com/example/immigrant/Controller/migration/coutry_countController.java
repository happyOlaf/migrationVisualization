package com.example.immigrant.Controller.migration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/count")
public class coutry_countController {
    @Autowired
    private com.example.immigrant.Repository.migration.Count.country_count00Repository coutry_count00Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.Count.country_count05Repository coutry_count05Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.Count.country_count10Repository coutry_count10Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.Count.country_count15Repository coutry_count15Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.Count.country_count19Repository coutry_count19Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.Count.country_count90Repository coutry_count90Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.Count.country_count95Repository coutry_count95Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.Count.country_countRepository country_countRepository;
    //按年份输出记录
    @GetMapping(value = "/Country/{country}")
    public List<com.example.immigrant.domain.migration.Count.country_count> country_countList(@PathVariable("country") String country){
        return country_countRepository.findByContry(country);
    }
    //按照年份输出表结果
    @GetMapping(value = "/2000")
    public List<com.example.immigrant.domain.migration.Count.country_count00> country_count00List(){
        return coutry_count00Repository.findAll();
    }
    @GetMapping(value = "/2005")
    public List<com.example.immigrant.domain.migration.Count.country_count05> country_count05List(){
        return coutry_count05Repository.findAll();
    }
    @GetMapping(value = "/2010")
    public List<com.example.immigrant.domain.migration.Count.country_count10> country_count10List(){
        return coutry_count10Repository.findAll();
    }
    @GetMapping(value = "/2015")
    public List<com.example.immigrant.domain.migration.Count.country_count15> country_count15List(){
        return coutry_count15Repository.findAll();
    }
    @GetMapping(value = "/2019")
    public List<com.example.immigrant.domain.migration.Count.country_count19> country_count19List(){
        return coutry_count19Repository.findAll();
    }
    @GetMapping(value = "/1990")
    public List<com.example.immigrant.domain.migration.Count.country_count90> country_count90List(){
        return coutry_count90Repository.findAll();
    }
    @GetMapping(value = "/1995")
    public List<com.example.immigrant.domain.migration.Count.country_count95> country_count95List(){
        return coutry_count95Repository.findAll();
    }
    //按照年份按des_num降序输出表结果
    @GetMapping(value = "/2000/des/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count00> country_count00ListOrderByDes_numDesc(){
        return coutry_count00Repository.OrderByDesnumDesc();
    }
    @GetMapping(value = "/2005/des/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count05> country_count05ListOrderByDes_numDesc(){
        return coutry_count05Repository.OrderByDesnumDesc();
    }
    @GetMapping(value = "/2010/des/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count10> country_count10ListOrderByDes_numDesc(){
        return coutry_count10Repository.OrderByDesnumDesc();
    }
    @GetMapping(value = "/2015/des/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count15> country_count15ListOrderByDes_numDesc(){
        return coutry_count15Repository.OrderByDesnumDesc();
    }
    @GetMapping(value = "/2019/des/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count19> country_count19ListOrderByDes_numDesc(){
        return coutry_count19Repository.OrderByDesnumDesc();
    }
    @GetMapping(value = "/1990/des/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count90> country_count90ListOrderByDes_numDesc(){
        return coutry_count90Repository.OrderByDesnumDesc();
    }
    @GetMapping(value = "/1995/des/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count95> country_count95ListOrderByDes_numDesc(){
        return coutry_count95Repository.OrderByDesnumDesc();
    }
    //按照年份按ori_num降序输出表结果
    @GetMapping(value = "/2000/ori/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count00> country_count00ListOrderByOri_numDesc(){
        return coutry_count00Repository.OrderByOrinumDesc();
    }
    @GetMapping(value = "/2005/ori/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count05> country_count05ListOrderByOri_numDesc(){
        return coutry_count05Repository.OrderByOrinumDesc();
    }
    @GetMapping(value = "/2010/ori/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count10> country_count10ListOrderByOri_numDesc(){
        return coutry_count10Repository.OrderByOrinumDesc();
    }
    @GetMapping(value = "/2015/ori/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count15> country_count15ListOrderByOri_numDesc(){
        return coutry_count15Repository.OrderByOrinumDesc();
    }
    @GetMapping(value = "/2019/ori/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count19> country_count19ListOrderByOri_numDesc(){
        return coutry_count19Repository.OrderByOrinumDesc();
    }
    @GetMapping(value = "/1990/ori/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count90> country_count90ListOrderByOri_numDesc(){
        return coutry_count90Repository.OrderByOrinumDesc();
    }
    @GetMapping(value = "/1995/ori/Desc")
    public List<com.example.immigrant.domain.migration.Count.country_count95> country_count95ListOrderByOri_numDesc(){
        return coutry_count95Repository.OrderByOrinumDesc();
    }

}
