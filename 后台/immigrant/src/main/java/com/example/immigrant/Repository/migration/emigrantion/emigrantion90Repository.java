package com.example.immigrant.Repository.migration.emigrantion;

import com.example.immigrant.domain.migration.emigration.emigration90;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface emigrantion90Repository extends JpaRepository<emigration90,Integer> {
    //通过目的国家查询
    public List<emigration90> findByTo(String Destination);
    //通过目的国家查询并通过count降序排列
    public List<emigration90> findByToOrderByCountDesc(String Destination);
    //通过目的国家查询并通过count升序排列
    public List<emigration90> findByToOrderByCountAsc(String Destination);
    //通过count升序排列
    public List<emigration90> OrderByCountAsc();
    //通过count降序序排列
    public List<emigration90> OrderByCountDesc();
}
