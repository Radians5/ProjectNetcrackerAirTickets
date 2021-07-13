package com.websiteair.websiteTravel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @Column(name = "flight_id", length = 80)
    private Integer flightId;
    @Column(name = "departure_airport", length = 80, nullable = false)
    private Integer departureAirport;
    @Column(name = "arrival_airport", length = 80, nullable = false)
    private Integer arrivalAirport;
    @Column(name = "id_airlines", length = 80, nullable = false)
    private Integer idAirlines;
    @Column(name = "departure_date", length = 80, nullable = false)
    @org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime departureDate;
    @Column(name = "arrival_date", length = 80, nullable = false)
    @org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime arrivalDate;
    @Column(name = "total_num_of_passengers_first_class", nullable = false)
    private Integer totalNunOfPassFirst;
    @Column(name = "total_num_of_passengers_second_class", nullable = false)
    private Integer totalNunOfPassSecond;

    public Flight() {
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Integer departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Integer getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Integer arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Integer getSidAirlines() {
        return idAirlines;
    }

    public void setSidAirlines(Integer sidAirlines) {
        this.idAirlines = idAirlines;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getTotalNunOfPassFirst() {
        return totalNunOfPassFirst;
    }

    public void setTotalNunOfPassFirst(Integer totalNunOfPassFirst) {
        this.totalNunOfPassFirst = totalNunOfPassFirst;
    }

    public Integer getTotalNunOfPassSecond() {
        return totalNunOfPassSecond;
    }

    public void setTotalNunOfPassSecond(Integer totalNunOfPassSecond) {
        this.totalNunOfPassSecond = totalNunOfPassSecond;
    }

    public Integer getTotalNunOfPassThird() {
        return totalNunOfPassThird;
    }

    public void setTotalNunOfPassThird(Integer totalNunOfPassThird) {
        this.totalNunOfPassThird = totalNunOfPassThird;
    }

    public Flight(Integer flightId, Integer departureAirport, Integer arrivalAirport, Integer idAirlines, LocalDateTime departureDate, LocalDateTime arrivalDate, Integer totalNunOfPassFirst, Integer totalNunOfPassSecond, Integer totalNunOfPassThird) {
        this.flightId = flightId;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.idAirlines = idAirlines;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.totalNunOfPassFirst = totalNunOfPassFirst;
        this.totalNunOfPassSecond = totalNunOfPassSecond;
        this.totalNunOfPassThird = totalNunOfPassThird;
    }

    @Column(name = "total_num_of_passengers_third_class", nullable = false)
    private Integer totalNunOfPassThird;
}
