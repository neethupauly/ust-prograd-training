package com.mainproject.movieTicket.service;


import com.mainproject.movieTicket.entity.Movie;
import com.mainproject.movieTicket.entity.User;
import com.mainproject.movieTicket.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie findByMovieId(Long movieId) {
        return movieRepository.getById(movieId);

    }
    public List<Movie> listAllMovies(){
        return movieRepository.findAll();
    }

}
