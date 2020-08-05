package com.example.immigrant.domain.migration.Count;

import com.example.immigrant.domain.choice_4;

import javax.persistence.*;

@Entity
@Table(name = "country_count")
@IdClass(Choice_6.class)
public class country_count {
    @Id
    @Column(nullable = false,name = "contry")
    private String contry;
    @Column(name = "des_num")
    private Integer desnum;
    @Column(name = "ori_num")
    private Integer orinum;
    @Column(nullable = false,name = "year")
    private Integer year;

    @Override
    public String toString() {
        return "country_count{" +
                "contry='" + contry + '\'' +
                ", desnum=" + desnum +
                ", orinum=" + orinum +
                ", year=" + year +
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
