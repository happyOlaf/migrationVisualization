package com.example.immigrant.domain.migration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class netmigrationrate {

    @Id
    @Column(nullable = false,name = "location")
    private String location;
    @Column(name = "netmigrationrate9095")
    private double netmigrationrate9095;
    @Column(name = "netmigrationrate9500")
    private double netmigrationrate9500;
    @Column(name = "netmigrationrate0005")
    private double netmigrationrate0005;
    @Column(name = "netmigrationrate0510")
    private double netmigrationrate0510;
    @Column(name = "netmigrationrate1015")
    private double netmigrationrate1015;
    @Column(name = "netmigrationrate1520")
    private double netmigrationrate1520;

    @Override
    public String toString() {
        return "netmigrationrate{" +
                "Location='" + location + '\'' +
                ", netmigrationrate9095=" + netmigrationrate9095 +
                ", netmigrationrate9500=" + netmigrationrate9500 +
                ", netmigrationrate0005=" + netmigrationrate0005 +
                ", netmigrationrate0510=" + netmigrationrate0510 +
                ", netmigrationrate1015=" + netmigrationrate1015 +
                ", netmigrationrate1520=" + netmigrationrate1520 +
                '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getNetmigrationrate9095() {
        return netmigrationrate9095;
    }

    public void setNetmigrationrate9095(double netmigrationrate9095) {
        this.netmigrationrate9095 = netmigrationrate9095;
    }

    public double getNetmigrationrate9500() {
        return netmigrationrate9500;
    }

    public void setNetmigrationrate9500(double netmigrationrate9500) {
        this.netmigrationrate9500 = netmigrationrate9500;
    }

    public double getNetmigrationrate0005() {
        return netmigrationrate0005;
    }

    public void setNetmigrationrate0005(double netmigrationrate0005) {
        this.netmigrationrate0005 = netmigrationrate0005;
    }

    public double getNetmigrationrate0510() {
        return netmigrationrate0510;
    }

    public void setNetmigrationrate0510(double netmigrationrate0510) {
        this.netmigrationrate0510 = netmigrationrate0510;
    }

    public double getNetmigrationrate1015() {
        return netmigrationrate1015;
    }

    public void setNetmigrationrate1015(double netmigrationrate1015) {
        this.netmigrationrate1015 = netmigrationrate1015;
    }

    public double getNetmigrationrate1520() {
        return netmigrationrate1520;
    }

    public void setNetmigrationrate1520(double netmigrationrate1520) {
        this.netmigrationrate1520 = netmigrationrate1520;
    }
}
