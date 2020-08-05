package com.example.immigrant.Repository.migration;

import com.example.immigrant.domain.migration.migrantion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface migrantionRepository extends JpaRepository<migrantion,Integer> {
    //通过起始国家查询
    public List<migrantion> findByFrom(String Origin);
    //通过目的国家查询
    public List<migrantion> findByTo(String Destination);
    //通过年份查询
    public List<migrantion> findByYear(Integer Year);
    //通过年份查询并升序返回
    public List<migrantion> findByYearOrderByCountAsc(Integer Year);
    //通过年份查询并降序返回
    public List<migrantion> findByYearOrderByCountDesc(Integer Year);
}
