package com.feel_free_trips;

import com.feel_free_trips.model.Trip;
import com.feel_free_trips.service.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeelFreeTripsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FeelFreeTripsApplication.class, args);
	}

	@Autowired
	ITripService tripService;
	@Override
	public void run(String... args) throws Exception {
//		Trip trip = new Trip();
//		tripService.addTrip(new Trip(7,"Raj",10,125,"DEl",479,"BAN",8,"",2001));
//		tripService.addTrip(new Trip(6,"Abhi",8,720,"GWLR",256,"LKO",9,"",2000));
//		tripService.updateTrip(new Trip(7,"Raj",10,125,"DEL",256,"LKO",15,"SubScriber",2001));
//		tripService.deleteTrip(7);
		tripService.getByName("Raj").forEach(System.out::println);
		tripService.getAll().stream().forEach(System.out::println);
		System.out.println("Detail about Trip using Id"+tripService.getById(1));
		tripService.getByTripDuration(10).forEach(System.out::println);
		tripService.getByStartStationName("BAN").forEach(System.out::println);
		tripService.getByEndStationName("BAN").forEach(System.out::println);
		tripService.getByStartStationId(125).forEach(System.out::println);
		tripService.getByEndStationId(125).forEach(System.out::println);
		tripService.getByBirthYear(1998).forEach(System.out::println);
		tripService.getByStartStationNameAndEndStationName("BAN","DEL").forEach(System.out::println);
		tripService.getByStartStationIdAndEndStationId(479,256).forEach(System.out::println);
	}
}
