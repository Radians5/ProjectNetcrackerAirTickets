package com.websiteair.websiteTravel.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class GetFlightsRequest {
    private final String departureCountryName;
    private final String departureCityName;
    private final String arrivalCountryName;
    private final String arrivalCityName;
    private final Integer airline;
    private final LocalDateTime departureTimeStart;
    private final LocalDateTime departureTimeEnd;
    private final LocalDateTime arrivalTimeStart;
    private final LocalDateTime arrivalTimeEnd;

    public String getDepartureCountryName() {
        return departureCountryName;
    }

    public String getDepartureCityName() {
        return departureCityName;
    }

    public String getArrivalCountryName() {
        return arrivalCountryName;
    }

    public String getArrivalCityName() {
        return arrivalCityName;
    }

    public Integer getAirline() {
        return airline;
    }

    public LocalDateTime getDepartureTimeStart() {
        return departureTimeStart;
    }

    public LocalDateTime getDepartureTimeEnd() {
        return departureTimeEnd;
    }

    public LocalDateTime getArrivalTimeStart() {
        return arrivalTimeStart;
    }

    public LocalDateTime getArrivalTimeEnd() {
        return arrivalTimeEnd;
    }

    @JsonCreator
    public GetFlightsRequest(@JsonProperty("departureCountryName") String departureCountryName,
                             @JsonProperty("departureCityName") String departureCityName,
                             @JsonProperty("arrivalCountryName") String arrivalCountryName,
                             @JsonProperty("arrivalCityName") String arrivalCityName,
                             @JsonProperty("airline") Integer airline,
                            @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") @JsonProperty("departureTimeStart") LocalDateTime departureTimeStart,
                             @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") @JsonProperty("departureTimeEnd") LocalDateTime departureTimeEnd,
                             @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") @JsonProperty("arrivalTimeStart") LocalDateTime arrivalTimeStart,
                             @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")@JsonProperty("arrivalTimeEnd") LocalDateTime arrivalTimeEnd) {
        this.departureCountryName = departureCountryName;
        this.departureCityName = departureCityName;
        this.arrivalCountryName = arrivalCountryName;
        this.arrivalCityName = arrivalCityName;
        this.airline = airline;
        this.departureTimeStart = departureTimeStart;
        this.departureTimeEnd = departureTimeEnd;
        this.arrivalTimeStart = arrivalTimeStart;
        this.arrivalTimeEnd = arrivalTimeEnd;
    }

    @Override
    public String toString() {
        return "GetFlightsRequest{" +
                "departureCountryName='" + departureCountryName + '\'' +
                ", departureCityName='" + departureCityName + '\'' +
                ", arrivalCountryName='" + arrivalCountryName + '\'' +
                ", arrivalCityName='" + arrivalCityName + '\'' +
                ", airline=" + airline +
                ", departureTimeStart=" + departureTimeStart +
                ", departureTimeEnd=" + departureTimeEnd +
                ", arrivalTimeStart=" + arrivalTimeStart +
                ", arrivalTimeEnd=" + arrivalTimeEnd +
                '}';
    }
}
