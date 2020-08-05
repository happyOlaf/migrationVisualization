package com.example.immigrant.domain.migration.emigration;

import javax.persistence.Column;
import java.io.Serializable;

public class choice_2 implements Serializable {
    @Column(nullable = false,name = "destination")
    private String to;
    @Column(nullable = false,name = "origin")
    private String from;


    public choice_2(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public choice_2() {
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
