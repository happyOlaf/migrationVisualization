package com.example.immigrant.domain.migration.emigration;
import javax.persistence.*;


@Entity
@IdClass(choice_2.class)
public class emigration10 {
    @Id
    @Column(nullable = false,name = "destination")
    private String to;
    @Id
    @Column(nullable = false,name = "origin")
    private String from;
    private Integer count;


    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
