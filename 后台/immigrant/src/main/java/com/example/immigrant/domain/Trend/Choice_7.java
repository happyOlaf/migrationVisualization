package com.example.immigrant.domain.Trend;

import javax.persistence.Column;
import java.io.Serializable;

public class Choice_7 implements Serializable {
    @Column(nullable = false,name = "top")
    private String top;
    @Column(nullable = false,name = "year")
    private Integer year;

    public Choice_7() {
    }

    public Choice_7(String top, Integer year) {
        this.top = top;
        this.year = year;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
