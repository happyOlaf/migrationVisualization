package com.example.immigrant.domain.migration;

import javax.persistence.Column;
import java.io.Serializable;

public class choice_3 implements Serializable {
    @Column(nullable = false,name = "origin")
    private String from;
    @Column(nullable = false,name = "destination")
    private String to;
    @Column(nullable = false,name = "year")
    private Integer year;

    public choice_3(String from, String to, Integer year) {
        this.from = from;
        this.to = to;
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public choice_3() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
