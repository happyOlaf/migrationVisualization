package com.example.immigrant.Repository.Trend;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface relatedqueriesRepository extends JpaRepository<com.example.immigrant.domain.Trend.relatedqueries,Integer> {
    //按年份返回数据
    public List<com.example.immigrant.domain.Trend.relatedqueries> findByYear(Integer Year);
}
