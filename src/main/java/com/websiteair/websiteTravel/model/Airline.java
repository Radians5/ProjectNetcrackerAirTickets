package com.websiteair.websiteTravel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airline {
    @Id
    @Column (name = "id_airline", length = 80)
    private String idAirline;
    @Column (name = "airline_name", length = 80)
    private String ailineName;

    public Airline(String idAirline, String ailineName) {
        this.idAirline = idAirline;
        this.ailineName = ailineName;
    }

    public Airline() {

    }

    public String getIdAirline() {
        return idAirline;
    }

    public void setIdAirline(String idAirline) {
        this.idAirline = idAirline;
    }

    public String getAilineName() {
        return ailineName;
    }

    public void setAilineName(String ailineName) {
        this.ailineName = ailineName;
    }
}
