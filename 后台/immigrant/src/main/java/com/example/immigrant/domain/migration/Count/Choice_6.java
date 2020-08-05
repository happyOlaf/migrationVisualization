package com.example.immigrant.domain.migration.Count;

import javax.persistence.Column;
import java.io.Serializable;

public class Choice_6 implements Serializable {
    @Column(nullable = false,name = "contry")
    private String contry;
    @Column(nullable = false,name = "year")
    private Integer year;

    public Choice_6(String contry, Integer year) {
        this.contry = contry;
        this.year = year;
    }

    public Choice_6() {
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
