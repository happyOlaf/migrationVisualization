package com.example.immigrant.Repository.migration.Count;

import com.example.immigrant.domain.migration.Count.country_count10;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface country_count10Repository extends JpaRepository<country_count10,Integer> {
    //通过des_num降序返回
    public List<country_count10> OrderByDesnumDesc();
    //通过ori_num降序返回
    public List<country_count10> OrderByOrinumDesc();
}
