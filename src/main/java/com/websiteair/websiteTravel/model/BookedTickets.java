package com.websiteair.websiteTravel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booked_tickets")
public class BookedTickets {
    @Id
    @Column(name = "recording_id", length = 80)
    private Integer recordingId;
    @Column(name = "flight_id", length = 80)
    private Integer flightId;
    @Column(name = "booked_tickets", length = 80)
    private Integer bookedTickets;
    @Column(name = "class_ticket", length = 80)
    private String classTickets;
    private static int countId;

    public BookedTickets(Integer recordingId, Integer flightId, int bookedTickets, String classTickets) {
        this.recordingId = recordingId;
        this.flightId = flightId;
        this.bookedTickets = bookedTickets;
        this.classTickets = classTickets;
    }

    public Integer getRecordingId() {
        return recordingId;
    }

    public void setRecordingId(Integer recordingId) {
        this.recordingId = recordingId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public int getBookedTickets() {
        return bookedTickets;
    }

    public void setBookedTickets(Integer bookedTickets) {
        this.bookedTickets = bookedTickets;
    }

    public String getClassTickets() {
        return classTickets;
    }

    public void setClassTickets(String classTickets) {
        this.classTickets = classTickets;
    }

    public static int getCountId() {
        return countId;
    }

    public static void setCountId(int countId) {
        BookedTickets.countId = countId;
    }

    public BookedTickets() {

    }
}