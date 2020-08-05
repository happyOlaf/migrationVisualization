package com.example.immigrant.domain.migration;
import javax.persistence.*;

@Entity
@IdClass(choice_3.class)
public class migrantion {
    @Id
    @Column(nullable = false,name = "origin")
    private String from;
    @Id
    @Column(nullable = false,name = "destination")
    private String to;
    @Id
    @Column(nullable = false,name = "year")
    private Integer year;
    private Integer count;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
