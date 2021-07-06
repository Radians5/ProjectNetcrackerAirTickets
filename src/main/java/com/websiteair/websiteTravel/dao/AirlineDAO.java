package com.websiteair.websiteTravel.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AirlineDAO {
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public AirlineDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    public List<Airline> getAirId(String city){
//        return jdbcTemplate.query("SELECT*FROM Airline where city =?",new BeanPropertyRowMapper<>(Airline.class),city);
//    }
}
