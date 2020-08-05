package com.example.immigrant.domain.Trend;



import javax.persistence.*;

@Entity
@Table(name = "relatedqueries")
@IdClass(Choice_7.class)
public class relatedqueries {
    @Id
    @Column(nullable = false,name = "top")
    private String top;
    @Id
    @Column(nullable = false,name = "year")
    private Integer year;
    private Integer num1;
    private String rising;
    private double num2;

    @Override
    public String toString() {
        return "relatedqueries{" +
                "top='" + top + '\'' +
                ", year=" + year +
                ", num1=" + num1 +
                ", rising='" + rising + '\'' +
                ", num2=" + num2 +
                '}';
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

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public String getRising() {
        return rising;
    }

    public void setRising(String rising) {
        this.rising = rising;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
