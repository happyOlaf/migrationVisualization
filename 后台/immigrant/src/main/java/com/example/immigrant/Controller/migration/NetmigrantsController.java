package com.example.immigrant.Controller.migration;

import com.example.immigrant.domain.migration.Netmigrants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/NetMigration")
public class NetmigrantsController {
    @Autowired
    private com.example.immigrant.Repository.migration.NetmigrantsRepository netmigrantsRepository;
    //输出所有结果
    @GetMapping(value = "/all")
    public List<Netmigrants> PerCapitaGDPList(){
        return netmigrantsRepository.findAll();
    }
    //按国家输出结果
    @GetMapping(value = "/Country/{Country}")
    public List<Netmigrants> PerCapitaGDPListByArea(@PathVariable("Country") String Country){
        return netmigrantsRepository.findByCountry(Country);
    }
}
