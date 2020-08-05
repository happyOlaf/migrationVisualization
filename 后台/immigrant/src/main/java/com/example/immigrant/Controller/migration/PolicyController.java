package com.example.immigrant.Controller.migration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Policy")
public class PolicyController {
    @Autowired
    private com.example.immigrant.Repository.migration.PolicyRepository policyRepository;
    //输出所有记录
    @GetMapping(value = "/all")
    public List<com.example.immigrant.domain.migration.Policy> PolicyList(){
        return policyRepository.findAll();
    }
    //按日期返回数据
    @GetMapping(value = "/Date/Asc")
    public List<com.example.immigrant.domain.migration.Policy> PolicyListOrderByDateAsc(){
        return policyRepository.OrderByDateAsc();
    }
    //按月份返回数据
    @GetMapping(value = "/Month/Asc")
    public List<com.example.immigrant.domain.migration.Policy> PolicyListOrderByMonthAsc(){
        return policyRepository.OrderByMonthAsc();
    }
}
