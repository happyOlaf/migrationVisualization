package com.example.immigrant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Trend")
public class TrendController {
    @Autowired
    private com.example.immigrant.Repository.Trend.geomapRepository geomapRepository;
    @Autowired
    private com.example.immigrant.Repository.Trend.multitimelineRepository multitimelineRepository;
    @Autowired
    private com.example.immigrant.Repository.Trend.relatedqueriesRepository relatedqueriesRepository;
    //输出所有记录
    @GetMapping(value = "multiTimeline")
    public List<com.example.immigrant.domain.Trend.multitimeline> multiTimelineList(){
        return multitimelineRepository.findAll();
    }
    @GetMapping(value = "/geoMap")
    public List<com.example.immigrant.domain.Trend.geomap> geoMapList(){
        return geomapRepository.findAll();
    }
    @GetMapping(value = "/relatedQueries")
    public List<com.example.immigrant.domain.Trend.relatedqueries> relatedQueriesList(){
        return relatedqueriesRepository.findAll();
    }
    //按年份输出记录
    @GetMapping(value = "multiTimeline/{Year}")
    public List<com.example.immigrant.domain.Trend.multitimeline> multiTimelineListByYear(@PathVariable("Year") Integer Year){
        return multitimelineRepository.findByYear(Year);
    }
    @GetMapping(value = "/geoMap/{Year}")
    public List<com.example.immigrant.domain.Trend.geomap> geoMapListByYear(@PathVariable("Year") Integer Year){
        return geomapRepository.findByYear(Year);
    }
    @GetMapping(value = "/relatedQueries/{Year}")
    public List<com.example.immigrant.domain.Trend.relatedqueries> relatedQueriesListByYear(@PathVariable("Year") Integer Year){
        return relatedqueriesRepository.findByYear(Year);
    }
    //按年份输出记录并按照migration升序返回数据
    @GetMapping(value = "/geoMap/{Year}/Migration/Asc")
    public List<com.example.immigrant.domain.Trend.geomap> geoMapListByYearOrderByMigrationAsc(@PathVariable("Year") Integer Year){
        return geomapRepository.findByYearOrderByMigrationAsc(Year);
    }
    //按年份输出记录并按照migration降序返回数据
    @GetMapping(value = "/geoMap/{Year}/Migration/Desc")
    public List<com.example.immigrant.domain.Trend.geomap> geoMapListByYearOrderByMigrationDesc(@PathVariable("Year") Integer Year){
        return geomapRepository.findByYearOrderByMigrationDesc(Year);
    }
}
