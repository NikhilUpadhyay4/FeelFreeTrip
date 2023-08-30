package com.feel_free_trips.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Trip {
    @Id
    private Integer tripId;
    private String name;
    @Field("tripduration")
    private int tripDuration;
    @Field("start station id")
    private int startStationId;
    @Field("start station name")
    private String startStationName;
    @Field("end station id")
    private int endStationId;
    @Field("end station name")
    private String endStationName;
    @Field("bikeid")
    private int bikeId;
    @Field("usertype")
    private String userType;
    @Field("birth year")
    private int birthYear;
}
