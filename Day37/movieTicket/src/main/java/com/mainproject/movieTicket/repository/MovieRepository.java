package com.mainproject.movieTicket.repository;

import com.mainproject.movieTicket.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
