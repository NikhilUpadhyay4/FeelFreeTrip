package com.feel_free_trips.exceptions;

public class TripNotFoundException extends RuntimeException{
    public TripNotFoundException() {
        super();
    }

    public TripNotFoundException(String message) {
        super(message);
    }
}
