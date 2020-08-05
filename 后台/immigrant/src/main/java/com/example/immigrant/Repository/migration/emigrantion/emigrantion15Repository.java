package com.example.immigrant.Repository.migration.emigrantion;

import com.example.immigrant.domain.migration.emigration.emigration15;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface emigrantion15Repository extends JpaRepository<emigration15,Integer> {
    //通过目的国家查询
    public List<emigration15> findByTo(String Destination);
    //通过目的国家查询并通过count降序排列
    public List<emigration15> findByToOrderByCountDesc(String Destination);
    //通过目的国家查询并通过count升序排列
    public List<emigration15> findByToOrderByCountAsc(String Destination);
    //通过count升序排列
    public List<emigration15> OrderByCountAsc();
    //通过count降序序排列
    public List<emigration15> OrderByCountDesc();
}
