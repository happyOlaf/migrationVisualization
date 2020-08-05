package com.example.immigrant.domain.migration.immigration;
import javax.persistence.*;

@Entity
@IdClass(choice_1.class)
public class immigrantion05 {
    @Id
    @Column(nullable = false,name = "origin")
    private String from;
    @Id
    @Column(nullable = false,name = "destination")
    private String to;
    private Integer count;


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
