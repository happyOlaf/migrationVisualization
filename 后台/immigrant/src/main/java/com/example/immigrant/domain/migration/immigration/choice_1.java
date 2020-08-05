package com.example.immigrant.domain.migration.immigration;

import javax.persistence.Column;
import java.io.Serializable;

public class choice_1 implements Serializable {
    @Column(nullable = false,name = "origin")
    private String from;
    @Column(nullable = false,name = "destination")
    private String to;

    public choice_1(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public choice_1() {
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
