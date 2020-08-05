package com.example.immigrant.Controller.GDP;

import com.example.immigrant.Repository.GDP.GDPRepository;
import com.example.immigrant.domain.GDP.GDP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/GPD")
public class GDPController {
    @Autowired
    private GDPRepository GDPRepository;
    //输出所有结果
    @GetMapping(value = "/all")
    public List<GDP> GDPList(){
        return GDPRepository.findAll();
    }
    //按国家输出结果
    @GetMapping(value = "/Area/{Area}")
    public List<GDP> GDPListByArea(@PathVariable("Area") String Area){
        return GDPRepository.findByArea(Area);
    }
    //按年份输出结果
    @GetMapping(value = "/Year/{Year}")
    public List<GDP> GDPListByYear(@PathVariable("Year") Integer Year){
        return GDPRepository.findByYear(Year);
    }
    //按国家年份输出结果
    @GetMapping(value = "/Area-Year/{Area}/{Year}")
    public List<GDP> GDPListByAreaAndYear(@PathVariable("Area") String Area,@PathVariable("Year") Integer Year){
        return GDPRepository.findByAreaAndYear(Area,Year);
    }
}
