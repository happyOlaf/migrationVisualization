package com.example.immigrant.Repository.migration;

import com.example.immigrant.domain.migration.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PolicyRepository extends JpaRepository<com.example.immigrant.domain.migration.Policy,Integer> {
    //按时间升序排序
    public List<Policy> OrderByDateAsc();
    //按月份升序排序
    public List<Policy> OrderByMonthAsc();
}
