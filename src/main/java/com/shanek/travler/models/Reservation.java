package com.shanek.travler.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "reservations")

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationid;

    @OneToOne
    @JoinColumn(name = "vehicleid")
    @JsonIgnoreProperties(value = "reservations",
        allowSetters = true)
    private Vehicle vehicle;

    @OneToOne
    @JoinColumn(name = "clientid")
    @JsonIgnoreProperties(value = "reservations",
        allowSetters = true)
    private Client client;

    private String reservationdate;

    public Reservation() {
    }

    public Reservation(
        Vehicle vehicle,
        Client client,
        String reservationdate) {
        this.vehicle = vehicle;
        this.client = client;
        this.reservationdate = reservationdate;
    }

    public long getReservationid() {
        return reservationid;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getReservationdate() {
        return reservationdate;
    }

    public void setReservationdate(String reservationdate) {
        this.reservationdate = reservationdate;
    }
}
