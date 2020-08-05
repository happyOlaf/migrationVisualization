package com.example.immigrant.domain.migration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "policy")
public class Policy {
    @Id
    private Integer id;
    private String country;
    private java.sql.Date date;
    private double lon;
    private double lat;
    private double zoom;
    private Integer month;
    private String title;
    private String contain;

    @Override
    public String toString() {
        return "Policy{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", date=" + date +
                ", lon=" + lon +
                ", lat=" + lat +
                ", zoom=" + zoom +
                ", month=" + month +
                ", title='" + title + '\'' +
                ", contain='" + contain + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getZoom() {
        return zoom;
    }

    public void setZoom(double zoom) {
        this.zoom = zoom;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }
}
