package com.example.immigrant.Repository.Trend;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface geomapRepository extends JpaRepository<com.example.immigrant.domain.Trend.geomap,Integer> {
    //通过年份返回数据
    public List<com.example.immigrant.domain.Trend.geomap> findByYear(Integer Year);
    //通过年份按照migration升序返回数据
    public List<com.example.immigrant.domain.Trend.geomap> findByYearOrderByMigrationAsc(Integer Year);
    //通过年份按照migration降序返回数据
    public List<com.example.immigrant.domain.Trend.geomap> findByYearOrderByMigrationDesc(Integer Year);
}
