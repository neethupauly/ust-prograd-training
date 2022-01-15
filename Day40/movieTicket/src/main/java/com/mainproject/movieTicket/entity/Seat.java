package com.mainproject.movieTicket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seat {

    @Id
    private Long seatId;
    @Column(nullable = false)
    private Integer availableNoOfSeats;

    public Seat(Long seatId, Integer availableNoOfSeats) {
        this.seatId = seatId;
        this.availableNoOfSeats = availableNoOfSeats;
    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public Integer getAvailableNoOfSeats() {
        return availableNoOfSeats;
    }

    public void setAvailableNoOfSeats(Integer availableNoOfSeats) {
        this.availableNoOfSeats = availableNoOfSeats;
    }
}
