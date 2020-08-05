package com.example.immigrant.domain;

import javax.persistence.Column;
import java.io.Serializable;

public class choice_4 implements Serializable {
    @Column(nullable = false,name = "area")
    private String area;
    @Column(nullable = false,name = "year")
    private Integer year;

    public choice_4(String area, Integer year) {
        this.area = area;
        this.year = year;
    }

    public choice_4() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
