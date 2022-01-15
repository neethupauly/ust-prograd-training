package com.mainproject.movieTicket.controller;

import com.mainproject.movieTicket.entity.Movie;
import com.mainproject.movieTicket.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/movies")
    public String movieList(Model model){
        List<Movie> movies=movieService.listAllMovies();
        model.addAttribute("movieList",movies);
        return "movies";

    }
    @RequestMapping("/movieDetails/{id}")
    public String movieDetails(@PathVariable Long id,Model model){
        model.addAttribute("viewMovies", movieService.findByMovieId(id));
        return "movieDetails";

    }

    @RequestMapping("/seatMap")
    public String viewSeatMap(){
        return "seatMap";
    }



}
