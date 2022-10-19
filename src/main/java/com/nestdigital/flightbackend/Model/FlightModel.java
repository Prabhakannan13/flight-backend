package com.nestdigital.flightbackend.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class FlightModel {
    @Id
    @GeneratedValue
    private int id;
    private String flightname;
    private String origin;
    private String destination;
    private String capacity;

    public FlightModel(int id, String flightname, String origin, String destination, String capacity) {
        this.id = id;
        this.flightname = flightname;
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
    }

    public FlightModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightname() {
        return flightname;
    }

    public void setFlightname(String flightname) {
        this.flightname = flightname;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}

