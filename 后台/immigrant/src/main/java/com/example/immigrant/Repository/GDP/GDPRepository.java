package com.example.immigrant.Repository.GDP;

import com.example.immigrant.domain.GDP.GDP;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GDPRepository extends JpaRepository<GDP,Integer> {
    //通过国家获数据
    public List<GDP> findByArea(String Area);
    //通过年份获数据
    public List<GDP> findByYear(Integer Year);
    //通过国家和年份获数据
    public List<GDP> findByAreaAndYear(String Area,Integer Year);

}
