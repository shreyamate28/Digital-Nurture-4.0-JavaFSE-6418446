package com.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String cityName;

    // Many cities belong to one country
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "co_code")  // foreign key column in city table
    private Country country;

    public City() {}

    public City(String cityName, Country country) {
        this.cityName = cityName;
        this.country = country;
    }

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", country=" + (country != null ? country.getCoCode() : null) +
                '}';
    }
}
