package com.websiteair.websiteTravel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
        value = HttpStatus.GONE
)
public class TicketsAreOut extends RuntimeException {

        public TicketsAreOut(String t) {
            super(t);
        }
        public TicketsAreOut(String t, Throwable throwable){
            super(t,throwable);
        }
    }

