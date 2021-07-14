package com.websiteair.websiteTravel;

import com.websiteair.websiteTravel.model.Flight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class WebsiteTravelApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebsiteTravelApplication.class, args);
	}
}
