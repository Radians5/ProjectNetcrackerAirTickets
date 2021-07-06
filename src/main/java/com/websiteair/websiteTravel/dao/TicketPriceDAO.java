package com.websiteair.websiteTravel.dao;

import com.websiteair.websiteTravel.model.TicketPrice;
import com.websiteair.websiteTravel.request.BookedFlightRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TicketPriceDAO {
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public TicketPriceDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public TicketPrice getTicketInf(Integer flight_id){
        return jdbcTemplate.query("SELECT*FROM ticket_price where flight_id =?",new Object[]{flight_id}
                ,new BeanPropertyRowMapper<>(TicketPrice.class)).stream().findAny().orElse(null);

    }
    public void update(BookedFlightRequest bookedFlightRequest, TicketPrice remainingAmount){
        jdbcTemplate.update("UPDATE ticket_price SET flight_id =?, total_amount =?, remaining_amount =?  where recording_id = ? ",remainingAmount.getFlightId()
                ,remainingAmount.getTotalAmount(),remainingAmount.getRemainingAmount()-bookedFlightRequest.getQuantity(),remainingAmount.getRecordingId());

    }
}
