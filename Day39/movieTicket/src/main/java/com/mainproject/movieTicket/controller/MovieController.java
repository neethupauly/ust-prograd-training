package com.mainproject.movieTicket.controller;

import com.mainproject.movieTicket.entity.BookedSeats;
import com.mainproject.movieTicket.entity.Movie;
import com.mainproject.movieTicket.entity.Seat;
import com.mainproject.movieTicket.service.BookedSeatsService;
import com.mainproject.movieTicket.service.MovieService;
import com.mainproject.movieTicket.service.SeatService;
import com.mainproject.movieTicket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private SeatService seatService;

    @Autowired
    private BookedSeatsService bookedSeatsService;

    @Autowired
    private UserService userService;

    @RequestMapping("/movies")
    public String movieList(Model model) {
        List<Movie> movies = movieService.listAllMovies();
        model.addAttribute("movieList", movies);
        return "movies";

    }

    @RequestMapping("/movieDetails/{id}")
    public String movieDetails(@PathVariable Long id, Model model) {
        model.addAttribute("viewMovies", movieService.findByMovieId(id));
        return "movieDetails";

    }

    @RequestMapping("/seatMap/{id}")
    public String viewSeatMap(@PathVariable Long id, Model model) {
        model.addAttribute("movie", id);
        return "seatMap";
    }

    @PostMapping("/bookingSeats/{id}")
    public String viewBookedSeats(@PathVariable Long id, Model model, HttpServletRequest request) {
        model.addAttribute("movie", id);
        String bookSeats = request.getParameter("bookedSeats");
        String[] bookedSeats = bookSeats.split(",");
        for (String seats : bookedSeats) {
            BookedSeats bookedSeats1 = bookedSeatsService.getBySeatsAndMovieMovieId(seats, id);
            if (!(Objects.isNull(bookedSeats1))) {
                model.addAttribute("message", " This seat is already Booked..!");
                return "seatMap";
            }
        }
        for (String seat : bookedSeats) {
//            BookedSeats bookedSeats2=bookedSeatsService.getBySeatsAndMovieMovieId(seat,id);
            Seat seats = seatService.getBySeats(seat);
            BookedSeats bookedSeats2 = new BookedSeats(seats.getSeats(), seats.getPrice());
            bookedSeats2.setMovie(movieService.findByMovieId(id));
//            bookedSeats2.setUser(userService.findByid()
            bookedSeatsService.saveSeats(bookedSeats2);
            model.addAttribute("message", "Seats are booked...!");

        }
        return "bookedPage";
    }

}
