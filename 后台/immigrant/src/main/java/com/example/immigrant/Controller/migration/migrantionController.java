package com.example.immigrant.Controller.migration;

import com.example.immigrant.domain.migration.migrantion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/migration")
public class migrantionController {
    @Autowired
    private com.example.immigrant.Repository.migration.migrantionRepository migrantionRepository;
    //输出各年份表所有结果
    @GetMapping(value = "/all")
    public List<migrantion> emigration15List(){
        return migrantionRepository.findAll();
    }
    //按年份查询
    @GetMapping(value = "/{Year}")
    public List<migrantion> emigration15ListfindByYear(@PathVariable("Year") Integer year){
        return migrantionRepository.findByYear(year);
    }
    //按年份查询并升序排序
    @GetMapping(value = "/{Year}/Asc")
    public List<migrantion> emigration15ListfindByYearOrderByCountAsc(@PathVariable("Year") Integer year){
        return migrantionRepository.findByYearOrderByCountAsc(year);
    }
    //按年份查询
    @GetMapping(value = "/{Year}/Desc")
    public List<migrantion> emigration15ListfindByYearOrderByCountDesc(@PathVariable("Year") Integer year){
        return migrantionRepository.findByYearOrderByCountDesc(year);
    }
}
