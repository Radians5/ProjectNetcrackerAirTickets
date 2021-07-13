package com.websiteair.websiteTravel.service;

import com.websiteair.websiteTravel.dao.AirlineDAO;
import com.websiteair.websiteTravel.dao.BookedTicketsDAO;
import com.websiteair.websiteTravel.dao.FlightsDao;
import com.websiteair.websiteTravel.dao.TicketPriceDAO;
import com.websiteair.websiteTravel.exception.ApiRequestException;
import com.websiteair.websiteTravel.model.Flight;
import com.websiteair.websiteTravel.request.BookedFlightRequest;
import com.websiteair.websiteTravel.request.GetFlightsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class TicketService {

    private final FlightsDao flightsDao;
    private final AirlineDAO airlineDAO;
    private final BookedTicketsDAO bookedTicketsDAO;
    private final TicketPriceDAO ticketPriceDAO;

    @Autowired
    public TicketService(FlightsDao flightsDao,
                         AirlineDAO airlineDAO,
                         BookedTicketsDAO bookedTicketsDAO,
                         TicketPriceDAO ticketPriceDAO) {
        this.flightsDao = flightsDao;
        this.airlineDAO = airlineDAO;
        this.bookedTicketsDAO= bookedTicketsDAO;
        this.ticketPriceDAO = ticketPriceDAO;
    }


    public List<Flight> getFlight(GetFlightsRequest request){

        return flightsDao.getAll(request.getDepartureCityName(),request.getArrivalCityName()
                ,request.getDepartureTimeStart(),request.getDepartureTimeEnd(),request.getArrivalTimeStart(),
                request.getArrivalTimeEnd());
    }
    public synchronized void booked(BookedFlightRequest request){
        if (ticketPriceDAO.getTicketInf(request.getFlightId()).getRemainingAmount()<request.getQuantity()){
            ApiRequestException apiRequestException = new ApiRequestException("error, tickets have run out, booking is not possible");
            apiRequestException.initCause(new IndexOutOfBoundsException());
        } else
            bookedTicketsDAO.booked(request);
            ticketPriceDAO.update(request,ticketPriceDAO.getTicketInf(request.getFlightId()));
        }
    }


