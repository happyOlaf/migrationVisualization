package com.example.immigrant.Repository.migration.emigrantion;

import com.example.immigrant.domain.migration.emigration.emigration95;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface emigrantion95Repository extends JpaRepository<emigration95,Integer> {
    //通过目的国家查询
    public List<emigration95> findByTo(String Destination);
    //通过目的国家查询并通过count降序排列
    public List<emigration95> findByToOrderByCountDesc(String Destination);
    //通过目的国家查询并通过count升序排列
    public List<emigration95> findByToOrderByCountAsc(String Destination);
    //通过count升序排列
    public List<emigration95> OrderByCountAsc();
    //通过count降序序排列
    public List<emigration95> OrderByCountDesc();
}
