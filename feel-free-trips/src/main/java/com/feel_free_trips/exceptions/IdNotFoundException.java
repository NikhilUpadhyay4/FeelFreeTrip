package com.feel_free_trips.exceptions;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException() {
        super();
    }

    public IdNotFoundException(String message) {
        super(message);
    }
}
