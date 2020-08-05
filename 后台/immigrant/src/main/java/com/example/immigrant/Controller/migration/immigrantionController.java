package com.example.immigrant.Controller.migration;

import com.example.immigrant.domain.migration.immigration.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/emigration")
public class immigrantionController {
    @Autowired
    private com.example.immigrant.Repository.migration.immigration.imigrantion15Repository imigrantion15Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.immigration.imigrantion05Repository imigrantion05Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.immigration.imigrantion00Repository imigrantion00Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.immigration.imigrantion10Repository imigrantion10Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.immigration.imigrantion19Repository imigrantion19Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.immigration.imigrantion90Repository imigrantion90Repository;
    @Autowired
    private com.example.immigrant.Repository.migration.immigration.imigrantion95Repository imigrantion95Repository;
    //输出各个年份表所有结果
    @GetMapping(value = "/2015")
    public List<immigrantion15> immigrantion15List(){
        return imigrantion15Repository.findAll();
    }
    @GetMapping(value = "/2000")
    public List<immigrantion00> immigrantion00List(){
        return imigrantion00Repository.findAll();
    }
    @GetMapping(value = "/2005")
    public List<immigrantion05> immigrantion05List(){
        return imigrantion05Repository.findAll();
    }
    @GetMapping(value = "/2010")
    public List<immigrantion10> immigrantion10List(){
        return imigrantion10Repository.findAll();
    }
    @GetMapping(value = "/2019")
    public List<immigrantion19> immigrantion19List(){
        return imigrantion19Repository.findAll();
    }
    @GetMapping(value = "/1990")
    public List<immigrantion90> immigrantion90List(){
        return imigrantion90Repository.findAll();
    }
    @GetMapping(value = "/1995")
    public List<immigrantion95> immigrantion95List(){
        return imigrantion95Repository.findAll();
    }

    //根据各个年份表起始国家返回结果
    @GetMapping(value = "/2015/{Origin}")
    public List<immigrantion15> immigrantion15ListByOrigin(@PathVariable("Origin") String Origin){
        return imigrantion15Repository.findByFrom(Origin);
    }
    @GetMapping(value = "/2000/{Origin}")
    public List<immigrantion00> immigrantion00ListByOrigin(@PathVariable("Origin") String Origin){
        return imigrantion00Repository.findByFrom(Origin);
    }
    @GetMapping(value = "/2005/{Origin}")
    public List<immigrantion05> immigrantion05ListByOrigin(@PathVariable("Origin") String Origin){
        return imigrantion05Repository.findByFrom(Origin);
    }
    @GetMapping(value = "/2010/{Origin}")
    public List<immigrantion10> immigrantion10ListByOrigin(@PathVariable("Origin") String Origin){
        return imigrantion10Repository.findByFrom(Origin);
    }
    @GetMapping(value = "/2019/{Origin}")
    public List<immigrantion19> immigrantion19ListByOrigin(@PathVariable("Origin") String Origin){
        return imigrantion19Repository.findByFrom(Origin);
    }
    @GetMapping(value = "/1990/{Origin}")
    public List<immigrantion90> immigrantion90ListByOrigin(@PathVariable("Origin") String Origin){
        return imigrantion90Repository.findByFrom(Origin);
    }
    @GetMapping(value = "/1995/{Origin}")
    public List<immigrantion95> immigrantion95ListByOrigin(@PathVariable("Origin") String Origin){
        return imigrantion95Repository.findByFrom(Origin);
    }
    //根据各个年份表起始国家并通过Count降序返回结果返回结果
    @GetMapping(value = "/2015/{Origin}/Desc")
    public List<immigrantion15> immigrantion15ListByOriginOrderByCountDesc(@PathVariable("Origin") String Origin){
        return imigrantion15Repository.findByFromOrderByCountDesc(Origin);
    }
    @GetMapping(value = "/2000/{Origin}/Desc")
    public List<immigrantion00> immigrantion00ListByOriginOrderByCountDesc(@PathVariable("Origin") String Origin){
        return imigrantion00Repository.findByFromOrderByCountDesc(Origin);
    }
    @GetMapping(value = "/2005/{Origin}/Desc")
    public List<immigrantion05> immigrantion05ListByOriginOrderByCountDesc(@PathVariable("Origin") String Origin){
        return imigrantion05Repository.findByFromOrderByCountDesc(Origin);
    }
    @GetMapping(value = "/2010/{Origin}/Desc")
    public List<immigrantion10> immigrantion10ListByOriginOrderByCountDesc(@PathVariable("Origin") String Origin){
        return imigrantion10Repository.findByFromOrderByCountDesc(Origin);
    }
    @GetMapping(value = "/2019/{Origin}/Desc")
    public List<immigrantion19> immigrantion19ListByOriginOrderByCountDesc(@PathVariable("Origin") String Origin){
        return imigrantion19Repository.findByFromOrderByCountDesc(Origin);
    }
    @GetMapping(value = "/1995/{Origin}/Desc")
    public List<immigrantion95> immigrantion95ListByOriginOrderByCountDesc(@PathVariable("Origin") String Origin){
        return imigrantion95Repository.findByFromOrderByCountDesc(Origin);
    }
    @GetMapping(value = "/1990/{Origin}/Desc")
    public List<immigrantion90> immigrantion90ListByOriginOrderByCountDesc(@PathVariable("Origin") String Origin){
        return imigrantion90Repository.findByFromOrderByCountDesc(Origin);
    }
    //根据各个年份表起始国家并通过Count升序返回结果返回结果
    @GetMapping(value = "/1990/{Origin}/Asc")
    public List<immigrantion90> immigrantion90ListByOriginOrderByCountAsc(@PathVariable("Origin") String Origin){
        return imigrantion90Repository.findByFromOrderByCountAsc(Origin);
    }
    @GetMapping(value = "/1995/{Origin}/Asc")
    public List<immigrantion95> immigrantion95ListByOriginOrderByCountAsc(@PathVariable("Origin") String Origin){
        return imigrantion95Repository.findByFromOrderByCountAsc(Origin);
    }
    @GetMapping(value = "/2000/{Origin}/Asc")
    public List<immigrantion00> immigrantion00ListByOriginOrderByCountAsc(@PathVariable("Origin") String Origin){
        return imigrantion00Repository.findByFromOrderByCountAsc(Origin);
    }
    @GetMapping(value = "/2005/{Origin}/Asc")
    public List<immigrantion05> immigrantion05ListByOriginOrderByCountAsc(@PathVariable("Origin") String Origin){
        return imigrantion05Repository.findByFromOrderByCountAsc(Origin);
    }
    @GetMapping(value = "/2010/{Origin}/Asc")
    public List<immigrantion10> immigrantion10ListByOriginOrderByCountAsc(@PathVariable("Origin") String Origin){
        return imigrantion10Repository.findByFromOrderByCountAsc(Origin);
    }
    @GetMapping(value = "/2015/{Origin}/Asc")
    public List<immigrantion15> immigrantion15ListByOriginOrderByCountAsc(@PathVariable("Origin") String Origin){
        return imigrantion15Repository.findByFromOrderByCountAsc(Origin);
    }
    @GetMapping(value = "/2019/{Origin}/Asc")
    public List<immigrantion19> immigrantion19ListByOriginOrderByCountAsc(@PathVariable("Origin") String Origin){
        return imigrantion19Repository.findByFromOrderByCountAsc(Origin);
    }
}
