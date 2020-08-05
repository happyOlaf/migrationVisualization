package com.example.immigrant.Repository.Trend;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface multitimelineRepository extends JpaRepository<com.example.immigrant.domain.Trend.multitimeline,Integer> {
    //通过年份查询数据
    public List<com.example.immigrant.domain.Trend.multitimeline> findByYear(Integer Year);
}
