package com.websiteair.websiteTravel.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    @Autowired
    private final JdbcTemplate jdbcTemplate ;

    public UserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
//    public Usr getUser(String username){
//        System.out.println(username);
//        return jdbcTemplate.query("SELECT*FROM usr where username =?",new Object[]{username}
//                ,new BeanPropertyRowMapper<>(Usr.class)).stream().findAny().orElse(null);
//    }
//    public  void registration(Usr request){
//        jdbcTemplate.update("insert into usr values(default,?,?,?,?)",request.getUsername(),request.getPassword(),request.isActive(),request.getRoles());
//    }
}
