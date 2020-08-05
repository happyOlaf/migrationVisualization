package com.example.immigrant.Repository.migration.immigration;

import com.example.immigrant.domain.migration.immigration.immigrantion19;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface imigrantion19Repository extends JpaRepository<immigrantion19,Integer> {
    //通过起始国家查询
    public List<immigrantion19> findByFrom(String Origin);
    //通过目的国家查询并通过count降序排列
    public List<immigrantion19> findByFromOrderByCountDesc(String Destination);
    //通过目的国家查询并通过count升序排列
    public List<immigrantion19> findByFromOrderByCountAsc(String Destination);
}
