package com.shanek.travler.models;

import javax.persistence.*;

@Entity
@Table(name = "reservation")

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationid;

    private Vehicle vehicle;

    private Client client;

    private String reservationdate;
}
