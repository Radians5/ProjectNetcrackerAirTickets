package com.websiteair.websiteTravel.repo;

import com.websiteair.websiteTravel.model.Flights;
import org.springframework.data.repository.CrudRepository;

public interface FlightsRepository extends CrudRepository<Flights, String> {

}

