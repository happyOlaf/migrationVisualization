package com.example.immigrant.Repository.GDP;


import com.example.immigrant.domain.GDP.PerCapitaGDP;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerCapitaGDPRepository extends JpaRepository<PerCapitaGDP,Integer> {
    //通过国家获数据
    public List<PerCapitaGDP> findByArea(String Area);
    //通过年份获数据
    public List<PerCapitaGDP> findByYear(Integer Year);
    //通过国家和年份获数据
    public List<PerCapitaGDP> findByAreaAndYear(String Area, Integer Year);

}
