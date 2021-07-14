package com.websiteair.websiteTravel.dao;

import com.websiteair.websiteTravel.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Repository
public class FlightsDao {
    @Autowired
    private final JdbcTemplate jdbcTemplate;


    public FlightsDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Flight> getAll(String AirlineDep, String AirlineArr, LocalDateTime departureDateStart, LocalDateTime departureDateEnd,
                               LocalDateTime arrivalDateStart, LocalDateTime arrivalDateEnd){
        return jdbcTemplate.query
                ("select f.flight_id, f.departure_date, f.arrival_date, f.total_num_of_passengers_first_class, f.total_num_of_passengers_second_class, f.total_num_of_passengers_third_class from flight as f where \n" +
                                "departure_airport = (select id_airline from airline where city = ?) AND arrival_airport = (select id_airline from airline where city = ?) AND departure_date between ?\n" +
                                "                ::timestamp and ? ::timestamp AND  arrival_date between ? ::timestamp and ?\n" +
                                "                ::timestamp",(rs,rowNum)->{
        Flight flight = new Flight();
        flight.setFlightId(rs.getInt("flight_id"));
        flight.setDepartureDate(rs.getTimestamp("departure_date").toLocalDateTime());
        flight.setArrivalDate(rs.getTimestamp("arrival_date").toLocalDateTime());
        flight.setTotalNunOfPassFirst(rs.getInt("total_num_of_passengers_first_class"));
        flight.setTotalNunOfPassSecond(rs.getInt("total_num_of_passengers_second_class"));
        flight.setTotalNunOfPassThird(rs.getInt("total_num_of_passengers_third_class"));
        return flight;
        },AirlineDep,AirlineArr,
                departureDateStart,departureDateEnd,arrivalDateStart,arrivalDateEnd);
    }
}