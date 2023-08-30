package com.feel_free_trips.repository;

import com.feel_free_trips.exceptions.IdNotFoundException;
import com.feel_free_trips.exceptions.TripNotFoundException;
import com.feel_free_trips.model.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITripRepository extends MongoRepository<Trip,Integer>{

    @Query("{name:?0}")
    List<Trip> findByName(String name);
    @Query("{tripDuration:?0}")
    List<Trip> findByTripDuration(int tripDuration);
    @Query("{startStationName:?0}")
    List<Trip> findByStartStationName(String startStationName);
    @Query("{endStationName:?0}")
    List<Trip> findByEndStationName(String endStationName);
    @Query("{startStationId:?0}")
    List<Trip> findByStartStationId(int startStationId);
    @Query("{endStationId:?0}")
    List<Trip> findByEndStationId(int endStationId);
    @Query("{birthYear:?0}")
    List<Trip> findByBirthYear(int birthYear);
    @Query("{startStationName:?0,endStationName:?1}")
    List<Trip> findByStartStationNameAndEndStationName(String startStationName , String endStationName);
    @Query("{startStationId:?0,endStationId:?1}")
    List<Trip> findByStartStationIdAndEndStationId(int startStationId , int endStationId);

}
