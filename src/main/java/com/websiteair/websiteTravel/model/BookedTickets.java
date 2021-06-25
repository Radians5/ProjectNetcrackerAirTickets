package com.websiteair.websiteTravel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booked_tickets")
public class BookedTickets {
    @Id
    @Column (name = "recording_id", length = 80)
    private String recordingId;
    @Column(name = "flight_id", length = 80)
    private String flightId;
    @Column (name = "booked_tickets", length = 80)
    private String bookedTickets;
    @Column (name = "class_ticket",length = 80)
    private String classTickets;

    public BookedTickets(String recordingId, String flightId, String bookedTickets, String classTickets) {
        this.recordingId = recordingId;
        this.flightId = flightId;
        this.bookedTickets = bookedTickets;
        this.classTickets = classTickets;
    }

    public BookedTickets() {

    }

    public String getRecordingId() {
        return recordingId;
    }

    public void setRecordingId(String recordingId) {
        this.recordingId = recordingId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getBookedTickets() {
        return bookedTickets;
    }

    public void setBookedTickets(String bookedTickets) {
        this.bookedTickets = bookedTickets;
    }

    public String getClassTickets() {
        return classTickets;
    }

    public void setClassTickets(String classTickets) {
        this.classTickets = classTickets;
    }
}
