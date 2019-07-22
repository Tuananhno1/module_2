package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Size(min = 0, max = 30)
    private String nameCity;

    @Min(100)
    private double areaCity;

    @Min(1000)
    private double people;

    @Min(1000)
    private double GDP;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public double getAreaCity() {
        return areaCity;
    }

    public void setAreaCity(double areaCity) {
        this.areaCity = areaCity;
    }

    public double getPeople() {
        return people;
    }

    public void setPeople(double people) {
        this.people = people;
    }

    public double getGDP() {
        return GDP;
    }

    public void setGDP(double GDP) {
        this.GDP = GDP;
    }

    public String getDescriableCity() {
        return descriableCity;
    }

    public void setDescriableCity(String descriableCity) {
        this.descriableCity = descriableCity;
    }

    private String descriableCity;
}