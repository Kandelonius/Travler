package com.shanek.travler.models;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long vehicleid;

    private String type;

    private String model;

    private int passengers;

    private int miles;

    private int year;

    public Vehicle() {
    }

    public Vehicle(
        String type,
        String model,
        int passengers,
        int miles,
        int year) {
        this.type = type;
        this.model = model;
        this.passengers = passengers;
        this.miles = miles;
        this.year = year;
    }

    public long getVehicleid() {
        return vehicleid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
