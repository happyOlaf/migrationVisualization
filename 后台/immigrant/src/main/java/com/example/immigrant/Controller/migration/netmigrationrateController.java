package com.example.immigrant.Controller.migration;


import com.example.immigrant.domain.migration.netmigrationrate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/NetMigrationRate")
public class netmigrationrateController {
    @Autowired
    private com.example.immigrant.Repository.migration.netmigrationrateRepository netmigrationrateRepository;
    //输出所有结果
    @GetMapping(value = "/all")
    public List<netmigrationrate> PerCapitaGDPList(){
        return netmigrationrateRepository.findAll();
    }
    //按国家输出结果
    @GetMapping(value = "/Area/{Area}")
    public List<netmigrationrate> PerCapitaGDPListByArea(@PathVariable("Area") String Area){
        return netmigrationrateRepository.findByLocation(Area);
    }
}
