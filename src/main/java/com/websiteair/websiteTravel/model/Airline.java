package com.websiteair.websiteTravel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airline {
    @Id
    @Column(name = "id_airline")
    private Integer idAirline;
    @Column(name = "airline_name")
    private String airlineName;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;

    public Airline() {

    }

    public Integer getIdAirline() {
        return idAirline;
    }

    public void setIdAirline(Integer idAirline) {
        this.idAirline = idAirline;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Airline(Integer idAirline, String airlineName, String city, String country) {
        this.idAirline = idAirline;
        this.airlineName = airlineName;
        this.city = city;
        this.country = country;
    }

    public Airline(Integer idAirline) {

    }
}