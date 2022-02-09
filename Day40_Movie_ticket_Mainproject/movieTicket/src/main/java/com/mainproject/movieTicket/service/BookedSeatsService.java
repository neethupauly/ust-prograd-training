package com.mainproject.movieTicket.service;

import com.mainproject.movieTicket.entity.BookedSeats;
import com.mainproject.movieTicket.repository.BookedSeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedSeatsService {

    @Autowired
    private BookedSeatsRepository bookedSeatsRepository;

    public void saveSeats(BookedSeats bookedSeats) {
        bookedSeatsRepository.save(bookedSeats);
    }

    public Boolean existsByMovieMovieId(Long movieId){
        return bookedSeatsRepository.existsByMovieMovieId(movieId);
    }
    public Boolean existsBySeats(String seats){
        return bookedSeatsRepository.existsBySeats(seats);
    }

    public BookedSeats getBySeatsAndMovieMovieId(String seats, Long movieId)
    {
        return bookedSeatsRepository.getBySeatsAndMovieMovieId(seats,movieId);
    }
//    public List<BookedSeats> getByUserUserName(String userName)
//    {
//        return bookedSeatsRepository.findByUserUserName(userName);
//    }

}
