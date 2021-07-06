package com.websiteair.websiteTravel.dao;

import com.websiteair.websiteTravel.request.BookedFlightRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookedTicketsDAO {
    @Autowired
    private final JdbcTemplate jdbcTemplate;


    public BookedTicketsDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void booked(BookedFlightRequest request){
        jdbcTemplate.update("INSERT INTO booked_tickets VALUES(default ,?,?,?)",request.getFlightId(),request.getQuantity(),request.getClassTickets());
    }
}
