package com.websiteair.websiteTravel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flights {
    @Id
    @Column(name = "flight_id",length = 80)
    private String flightId;
    @Column(name = "departure_airport",length = 80,nullable = false)
    private String departureAirport;
    @Column(name = "arrival_airport",length = 80,nullable = false)
    private String arrivalAirport;
    @Column(name = "id_airlines",length = 80,nullable = false)
    private String sidAirlines;
    @Column(name = "departure_date",length = 80,nullable = false)
    private String departureDate;
    @Column(name = "arrival_date",length = 80,nullable = false)
    private String arrivalDate;
    @Column(name = "total_num_of_passengers_first_class",nullable = false)
    private int totalNunOfPassFirst;
    @Column(name = "total_num_of_passengers_second_class",nullable = false)
    private int totalNunOfPassSecond;
    @Column(name = "total_num_of_passengers_third_class",nullable = false)
    private int totalNunOfPassThird;

    public Flights(String flightId, String departureAirport, String arrivalAirport, String sidAirlines, String departureDate, String arrivalDate, int totalNunOfPassFirst, int totalNunOfPassSecond, int totalNunOfPassThird) {
        this.flightId = flightId;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.sidAirlines = sidAirlines;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.totalNunOfPassFirst = totalNunOfPassFirst;
        this.totalNunOfPassSecond = totalNunOfPassSecond;
        this.totalNunOfPassThird = totalNunOfPassThird;
    }

    public Flights() {

    }

    public String getflightId() {
        return flightId;
    }

    public void setflightId(String flightId) {
        this.flightId = flightId;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getSidAirlines() {
        return sidAirlines;
    }

    public void setSidAirlines(String sidAirlines) {
        this.sidAirlines = sidAirlines;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getTotalNunOfPassFirst() {
        return totalNunOfPassFirst;
    }

    public void setTotalNunOfPassFirst(int totalNunOfPassFirst) {
        this.totalNunOfPassFirst = totalNunOfPassFirst;
    }

    public int getTotalNunOfPassSecond() {
        return totalNunOfPassSecond;
    }

    public void setTotalNunOfPassSecond(int totalNunOfPassSecond) {
        this.totalNunOfPassSecond = totalNunOfPassSecond;
    }

    public int getTotalNunOfPassThird() {
        return totalNunOfPassThird;
    }

    public void setTotalNunOfPassThird(int totalNunOfPassThird) {
        this.totalNunOfPassThird = totalNunOfPassThird;
    }
}
