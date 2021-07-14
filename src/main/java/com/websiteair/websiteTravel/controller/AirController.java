package com.websiteair.websiteTravel.controller;
import com.websiteair.websiteTravel.dao.AirlineDAO;
import com.websiteair.websiteTravel.dao.BookedTicketsDAO;
import com.websiteair.websiteTravel.dao.FlightsDao;
import com.websiteair.websiteTravel.dao.TicketPriceDAO;
import com.websiteair.websiteTravel.model.BookedTickets;
import com.websiteair.websiteTravel.model.Flight;
import com.websiteair.websiteTravel.request.BookedFlightRequest;
import com.websiteair.websiteTravel.request.GetFlightsRequest;
import com.websiteair.websiteTravel.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AirController {

    private final FlightsDao flightsDao;
    private final AirlineDAO airlineDAO;
    private final BookedTicketsDAO bookedTicketsDAO;
    private final TicketPriceDAO ticketPriceDAO;
    @Autowired
    public AirController(FlightsDao flightsDao, AirlineDAO airlineDAO, BookedTicketsDAO bookedTicketsDAO, TicketPriceDAO ticketPriceDAO) {
        this.flightsDao = flightsDao;
        this.airlineDAO = airlineDAO;
        this.bookedTicketsDAO = bookedTicketsDAO;
        this.ticketPriceDAO = ticketPriceDAO;
    }

    @PostMapping("airline/flight")
    @ResponseBody
    public List<Flight> getFlights(@RequestBody GetFlightsRequest request) {
        TicketService ticketService = new TicketService(flightsDao,airlineDAO, bookedTicketsDAO,ticketPriceDAO);
        return  ticketService.getFlight(request);
    }
    @PostMapping("/ticketBooking")
    @ResponseBody
    public BookedTickets bookingFlights(@RequestBody BookedFlightRequest request) {
       TicketService ticketService = new TicketService(flightsDao,airlineDAO, bookedTicketsDAO,ticketPriceDAO);
        System.out.println("++++");
       ticketService.booked(request);
        return null;
    }
}
