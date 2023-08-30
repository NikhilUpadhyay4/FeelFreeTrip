package com.feel_free_trips.service;

import com.feel_free_trips.exceptions.IdNotFoundException;
import com.feel_free_trips.exceptions.TripNotFoundException;
import com.feel_free_trips.model.Trip;

import java.util.List;

public interface ITripService {

    void addTrip(Trip trip);
    void updateTrip(Trip trip);
    void deleteTrip(int tripId);

    List<Trip> getAll();
    Trip getById(int tripId)throws IdNotFoundException;
    List<Trip> getByName(String name) throws  TripNotFoundException;
    List<Trip> getByTripDuration(int tripDuration)throws TripNotFoundException;
    List<Trip> getByStartStationName(String startStationName)throws TripNotFoundException;
    List<Trip> getByEndStationName(String endStationName)throws TripNotFoundException;
    List<Trip> getByStartStationId(int startStationId) throws IdNotFoundException;
    List<Trip> getByEndStationId(int endStationId) throws IdNotFoundException;
    List<Trip> getByBirthYear(int birthYear)throws TripNotFoundException;
    List<Trip> getByStartStationNameAndEndStationName(String startStationName , String endStationName)throws TripNotFoundException;
    List<Trip> getByStartStationIdAndEndStationId(int startStationId , int endStationId)throws IdNotFoundException;
}
