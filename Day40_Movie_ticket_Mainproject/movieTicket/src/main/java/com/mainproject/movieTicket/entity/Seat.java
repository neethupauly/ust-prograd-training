package com.mainproject.movieTicket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Seat {


    @Id
    @GeneratedValue
    private Long seatId;
    private String seats;
    private double price;

    public Seat( String seats, double price) {

        this.seats = seats;
        this.price = price;
    }
    public Seat(){}

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
