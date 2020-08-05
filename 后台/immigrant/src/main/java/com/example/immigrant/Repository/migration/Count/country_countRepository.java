package com.example.immigrant.Repository.migration.Count;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface country_countRepository extends JpaRepository<com.example.immigrant.domain.migration.Count.country_count,Integer> {
    //通过国家查询
    public List<com.example.immigrant.domain.migration.Count.country_count> findByContry(String country);
}
