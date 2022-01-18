package com.mainproject.movieTicket.service;

import com.mainproject.movieTicket.entity.Seat;
import com.mainproject.movieTicket.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;


    public Seat getBySeats(String seats) {
        return seatRepository.getBySeats(seats);
    }
}
