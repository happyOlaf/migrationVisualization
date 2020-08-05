package com.example.immigrant.Repository.migration;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NetmigrantsRepository extends JpaRepository<com.example.immigrant.domain.migration.Netmigrants,Integer> {
    //通过国家查询记录
    public List<com.example.immigrant.domain.migration.Netmigrants> findByCountry(String country);
}
