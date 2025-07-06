package com.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code")
    private String coCode;

    @Column(name = "co_name")
    private String coName;

    // One country has many cities
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<City> cities;

    public Country() {}

    public Country(String coCode, String coName) {
        this.coCode = coCode;
        this.coName = coName;
    }

    // getters and setters

    public String getCoCode() {
        return coCode;
    }

    public void setCoCode(String coCode) {
        this.coCode = coCode;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "coCode='" + coCode + '\'' +
                ", coName='" + coName + '\'' +
                '}';
    }
}
