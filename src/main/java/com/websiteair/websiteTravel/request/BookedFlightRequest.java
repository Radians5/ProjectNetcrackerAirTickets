package com.websiteair.websiteTravel.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BookedFlightRequest {
    private final Integer flightId;
    private final Integer quantity;
    private final String classTickets;
    private final Integer recordingId;

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getRecordingId() {
        return recordingId;
    }
    @JsonCreator
    public BookedFlightRequest(@JsonProperty("flightId") Integer flightId,
                               @JsonProperty("quantity") Integer quantity,
                               @JsonProperty("classTickets") String classTickets,
                               @JsonProperty("recordingId")Integer recordingId)
                                {
        this.flightId = flightId;
        this.quantity = quantity;
        this.classTickets = classTickets;
        this.recordingId = recordingId;
                                }

    public Integer getFlightId() {
        return flightId;
    }

    public String getClassTickets() {
        return classTickets;
    }

}
