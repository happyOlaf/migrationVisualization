package com.example.immigrant.Repository.migration.emigrantion;

import com.example.immigrant.domain.migration.emigration.emigration10;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface emigrantion10Repository extends JpaRepository<emigration10,Integer> {
    //通过目的国家查询
    public List<emigration10> findByTo(String Destination);
    //通过目的国家查询并通过count降序排列
    public List<emigration10> findByToOrderByCountDesc(String Destination);
    //通过目的国家查询并通过count升序排列
    public List<emigration10> findByToOrderByCountAsc(String Destination);
    //通过count升序排列
    public List<emigration10> OrderByCountAsc();
    //通过count降序序排列
    public List<emigration10> OrderByCountDesc();
}
