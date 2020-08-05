package com.example.immigrant.Controller.GDP;

import com.example.immigrant.Repository.GDP.PerCapitaGDPRepository;
import com.example.immigrant.domain.GDP.PerCapitaGDP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/PerCapitaGDP")
public class PerCapitaGDPController {
    @Autowired
    private PerCapitaGDPRepository PerCapitaGDPRepository;
    //输出所有结果
    @GetMapping(value = "/all")
    public List<PerCapitaGDP> PerCapitaGDPList(){
        return PerCapitaGDPRepository.findAll();
    }
    //按国家输出结果
    @GetMapping(value = "/Area/{Area}")
    public List<PerCapitaGDP> PerCapitaGDPListByArea(@PathVariable("Area") String Area){
        return PerCapitaGDPRepository.findByArea(Area);
    }
    //按年份输出结果
    @GetMapping(value = "/Year/{Year}")
    public List<PerCapitaGDP> PerCapitaGDPListByYear(@PathVariable("Year") Integer Year){
        return PerCapitaGDPRepository.findByYear(Year);
    }
    //按国家年份输出结果
    @GetMapping(value = "/Area-Year/{Area}/{Year}")
    public List<PerCapitaGDP> PerCapitaGDPListByAreaAndYear(@PathVariable("Area") String Area,@PathVariable("Year") Integer Year){
        return PerCapitaGDPRepository.findByAreaAndYear(Area,Year);
    }
}
