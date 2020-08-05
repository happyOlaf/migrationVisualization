package com.example.immigrant.domain.migration.Count;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class country_count15 {
    @Id
    private String contry;
    @Column(name = "des_num")
    private Integer desnum;
    @Column(name = "ori_num")
    private Integer orinum;

    @Override
    public String toString() {
        return "country_count15{" +
                "contry='" + contry + '\'' +
                ", desnum=" + desnum +
                ", orinum=" + orinum +
                '}';
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public Integer getDesnum() {
        return desnum;
    }

    public void setDesnum(Integer desnum) {
        this.desnum = desnum;
    }

    public Integer getOrinum() {
        return orinum;
    }

    public void setOrinum(Integer orinum) {
        this.orinum = orinum;
    }
}
