package com.mainproject.movieTicket.repository;

import com.mainproject.movieTicket.entity.BookedSeats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookedSeatsRepository extends JpaRepository<BookedSeats,Long> {
   public Boolean existsByMovieMovieId(Long movieId);

   public Boolean existsBySeats(String seats);

   public BookedSeats getBySeatsAndMovieMovieId(String seats,Long movieId);
   public List<BookedSeats> findByUserUserName(String userName);
}
