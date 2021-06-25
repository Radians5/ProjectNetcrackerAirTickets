package com.websiteair.websiteTravel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ticket_price")
public class TicketPrice {
    @Id
    @Column (name = "recording_id", length = 80)
    private String recordingId;
    @Column(name = "flight_id", length = 80)
    private String flightId;
    @Column (name = "class_ticket",length = 80)
    private String classTickets;
    @Column (name = "total_amount", length = 80)
    private int totalAmount;
    @Column (name = "remaining_amount", length = 80)
    private int remainingAmount;

    public TicketPrice(String recordingId, String flightId, String classTickets, int totalAmount, int remainingAmount) {
        this.recordingId = recordingId;
        this.flightId = flightId;
        this.classTickets = classTickets;
        this.totalAmount = totalAmount;
        this.remainingAmount = remainingAmount;
    }

    public TicketPrice() {

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

    public String getClassTickets() {
        return classTickets;
    }

    public void setClassTickets(String classTickets) {
        this.classTickets = classTickets;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(int remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
}
