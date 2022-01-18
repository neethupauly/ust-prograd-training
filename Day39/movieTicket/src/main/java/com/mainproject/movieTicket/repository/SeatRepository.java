package com.mainproject.movieTicket.repository;

import com.mainproject.movieTicket.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat,Long> {


   public Seat getBySeats(String seats);
}
