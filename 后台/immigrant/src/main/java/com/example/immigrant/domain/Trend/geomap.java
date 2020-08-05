package com.example.immigrant.domain.Trend;

import com.example.immigrant.domain.choice_4;

import javax.persistence.*;

@Entity
@Table(name = "geomap")
@IdClass(choice_4.class)
public class geomap {
    @Id
    @Column(nullable = false,name = "area")
    private String area;
    @Id
    @Column(nullable = false,name = "year")
    private Integer year;
    private Integer migration;
    private String area_en;

    @Override
    public String toString() {
        return "geomap{" +
                "area='" + area + '\'' +
                ", year=" + year +
                ", migration=" + migration +
                ", area_en='" + area_en + '\'' +
                '}';
    }

    public String getArea_en() {
        return area_en;
    }

    public void setArea_en(String area_en) {
        this.area_en = area_en;
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

    public Integer getMigration() {
        return migration;
    }

    public void setMigration(Integer migration) {
        this.migration = migration;
    }
}
