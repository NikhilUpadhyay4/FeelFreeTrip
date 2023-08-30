package com.feel_free_trips.service;

import com.feel_free_trips.exceptions.IdNotFoundException;
import com.feel_free_trips.exceptions.TripNotFoundException;
import com.feel_free_trips.model.Trip;
import com.feel_free_trips.repository.ITripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TripServiceImpl implements ITripService{
    @Autowired
    ITripRepository tripRepository;
    @Override
    public void addTrip(Trip trip) {
      tripRepository.insert(trip);
    }

    @Override
    public void updateTrip(Trip trip) {
        tripRepository.save(trip);
    }

    @Override
    public void deleteTrip(int tripId) {
        tripRepository.deleteById(tripId);
    }

    @Override
    public List<Trip> getAll() {
        return tripRepository.findAll();
    }

    @Override
    public Trip getById(int tripId) throws IdNotFoundException {
      return tripRepository.findById(tripId)
              .orElseThrow(()->new IdNotFoundException("Id Not Found"));
    }

    @Override
    public List<Trip> getByName(String name) throws TripNotFoundException {
        List<Trip> trip = tripRepository.findByName(name);
        if(trip.isEmpty())
            throw new TripNotFoundException("This Trip is not available ");
        return trip;
    }

    @Override
    public List<Trip> getByTripDuration(int tripDuration) throws TripNotFoundException {
        List<Trip> trip = tripRepository.findByTripDuration(tripDuration);
        if(trip.isEmpty())
            throw new TripNotFoundException("This Trip for this"+tripDuration+" duration  not available ");
        return trip;
    }

    @Override
    public List<Trip> getByStartStationName(String startStationName) throws TripNotFoundException {
        List<Trip> trip = tripRepository.findByStartStationName(startStationName);
        if(trip.isEmpty())
            throw new TripNotFoundException("This Trip for this "+startStationName+" is not available ");
        return trip;
    }

    @Override
    public List<Trip> getByEndStationName(String endStationName) throws TripNotFoundException {
        List<Trip> trip = tripRepository.findByEndStationName(endStationName);
        if(trip.isEmpty())
            throw new TripNotFoundException("This Trip for this "+endStationName+" is not available ");
        return trip;
    }

    @Override
    public List<Trip> getByStartStationId(int startStationId) throws IdNotFoundException {
        List<Trip> trip = tripRepository.findByStartStationId(startStationId);
        if(trip.isEmpty())
            throw new TripNotFoundException("This Trip for this "+startStationId+" is not available ");
        return trip;
    }

    @Override
    public List<Trip> getByEndStationId(int endStationId) throws IdNotFoundException {
        List<Trip> trip = tripRepository.findByEndStationId(endStationId);
        if(trip.isEmpty())
            throw new TripNotFoundException("This Trip for this "+endStationId+" is not available ");
        return trip;
    }

    @Override
    public List<Trip> getByBirthYear(int birthYear) throws TripNotFoundException {
        List<Trip> trip = tripRepository.findByBirthYear(birthYear);
        if(trip.isEmpty())
            throw new TripNotFoundException("This Trip for this "+birthYear+" is not available ");
        return trip;
    }

    @Override
    public List<Trip> getByStartStationNameAndEndStationName(String startStationName, String endStationName)throws TripNotFoundException {
        List<Trip> trip = tripRepository.findByStartStationNameAndEndStationName(startStationName,endStationName);
        if(trip.isEmpty())
            throw new TripNotFoundException("This Trip is not available ");
        return trip;
    }

    @Override
    public List<Trip> getByStartStationIdAndEndStationId(int startStationId, int endStationId)throws TripNotFoundException {
        List<Trip> trip = tripRepository.findByStartStationIdAndEndStationId(startStationId,endStationId);
        if(trip.isEmpty())
            throw new TripNotFoundException("This Trip is not available ");
        return trip;
    }
}
