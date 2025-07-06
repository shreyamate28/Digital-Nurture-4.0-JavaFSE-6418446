package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Country {

    @Id
    private String coCode;
    private String coName;
    private LocalDate independenceDate;

    public Country() {}

    public Country(String coCode, String coName, LocalDate independenceDate) {
        this.coCode = coCode;
        this.coName = coName;
        this.independenceDate = independenceDate;
    }

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

    public LocalDate getIndependenceDate() {
        return independenceDate;
    }

    public void setIndependenceDate(LocalDate independenceDate) {
        this.independenceDate = independenceDate;
    }

    @Override
    public String toString() {
        return "Country{" +
                "coCode='" + coCode + '\'' +
                ", coName='" + coName + '\'' +
                ", independenceDate=" + independenceDate +
                '}';
    }
}
