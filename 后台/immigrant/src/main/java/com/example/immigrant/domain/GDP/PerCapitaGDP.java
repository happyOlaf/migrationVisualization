package com.example.immigrant.domain.GDP;

import com.example.immigrant.domain.choice_4;

import javax.persistence.*;

@Entity
@Table(name = "percapitagpd")
@IdClass(choice_4.class)
public class PerCapitaGDP {
    @Id
    @Column(nullable = false,name = "area")
    private String area;
    @Id
    @Column(nullable = false,name = "year")
    private Integer year;
    @Column(name = "gpd")
    private double gpd;

    @Override
    public String toString() {
        return "PerCapitaGDP{" +
                "Area='" + area + '\'' +
                ", year=" + year +
                ", gpd=" + gpd +
                '}';
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

    public double getGpd() {
        return gpd;
    }

    public void setGpd(double gpd) {
        this.gpd = gpd;
    }
}
