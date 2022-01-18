package com.mainproject.movieTicket.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.awt.*;
import java.sql.Date;
import java.sql.Time;
//import java.util.Date;

@Entity
public class Movie {
    @Id
    private Long movieId;
    @Column(nullable = false)
    private String movieName;
    @Column(nullable = false)
    private Time movieTime;
    @Column(nullable = false)
    private Date movieDate;




    public Movie(Long movieId, String movieName, Time movieTime, Date movieDate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieTime = movieTime;
        this.movieDate = movieDate;
    }

    public Movie(){

    }



    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Time getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(Time movieTime) {
        this.movieTime = movieTime;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }
}
