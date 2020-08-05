package com.example.immigrant.Repository.migration;

import com.example.immigrant.domain.migration.netmigrationrate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface netmigrationrateRepository extends JpaRepository<netmigrationrate,Integer> {
    //通过国家获数据
    public List<netmigrationrate> findByLocation(String Location);
}
