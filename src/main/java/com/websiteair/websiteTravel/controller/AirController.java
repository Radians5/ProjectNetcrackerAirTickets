package com.websiteair.websiteTravel.controller;
import com.websiteair.websiteTravel.model.Flights;
import com.websiteair.websiteTravel.repo.FlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AirController {

    @Autowired
    private FlightsRepository flightsRepository;
    @PostMapping ("/flightsUser")
    public String addToBase(Model model){
        Flights flights = new Flights();
        flightsRepository.save(flights);
        return "flightsUser";
    }
    @GetMapping ("/adminH" )
    public String goToAdm(Model model){
        return "adminH";
    }
    @RequestMapping(value="/main", method=RequestMethod.GET)
    public String getForm(Model model) {
        model.addAttribute("main");
        return "main";
    }
    @RequestMapping(value="/flightsUser", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("flights", new Flights());
        return "flightsUser";
    }

}