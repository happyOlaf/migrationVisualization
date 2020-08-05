package com.example.immigrant.domain.migration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Netmigrants {
    @Id
    @Column(nullable = false,name = "country")
    private String country;
    @Column(name = "Netmigrants9095")
    private Integer Netmigrants9095;
    @Column(name = "Netmigrants9500")
    private Integer Netmigrants9500;
    @Column(name = "Netmigrants0005")
    private Integer Netmigrants0005;
    @Column(name = "Netmigrants0510")
    private Integer Netmigrants0510;
    @Column(name = "Netmigrants1015")
    private Integer Netmigrants1015;
    @Column(name = "Netmigrants1520")
    private Integer Netmigrants1520;

    @Override
    public String toString() {
        return "Netmigrants{" +
                "country='" + country + '\'' +
                ", Netmigrants9095=" + Netmigrants9095 +
                ", Netmigrants9500=" + Netmigrants9500 +
                ", Netmigrants0005=" + Netmigrants0005 +
                ", Netmigrants0510=" + Netmigrants0510 +
                ", Netmigrants1015=" + Netmigrants1015 +
                ", Netmigrants1520=" + Netmigrants1520 +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getNetmigrants9095() {
        return Netmigrants9095;
    }

    public void setNetmigrants9095(Integer netmigrants9095) {
        Netmigrants9095 = netmigrants9095;
    }

    public Integer getNetmigrants9500() {
        return Netmigrants9500;
    }

    public void setNetmigrants9500(Integer netmigrants9500) {
        Netmigrants9500 = netmigrants9500;
    }

    public Integer getNetmigrants0005() {
        return Netmigrants0005;
    }

    public void setNetmigrants0005(Integer netmigrants0005) {
        Netmigrants0005 = netmigrants0005;
    }

    public Integer getNetmigrants0510() {
        return Netmigrants0510;
    }

    public void setNetmigrants0510(Integer netmigrants0510) {
        Netmigrants0510 = netmigrants0510;
    }

    public Integer getNetmigrants1015() {
        return Netmigrants1015;
    }

    public void setNetmigrants1015(Integer netmigrants1015) {
        Netmigrants1015 = netmigrants1015;
    }

    public Integer getNetmigrants1520() {
        return Netmigrants1520;
    }

    public void setNetmigrants1520(Integer netmigrants1520) {
        Netmigrants1520 = netmigrants1520;
    }
}
