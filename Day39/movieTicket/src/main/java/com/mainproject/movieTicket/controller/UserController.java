package com.mainproject.movieTicket.controller;

import com.mainproject.movieTicket.entity.Movie;
import com.mainproject.movieTicket.entity.User;
import com.mainproject.movieTicket.service.MovieService;
import com.mainproject.movieTicket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MovieService movieService;

    @RequestMapping("/home")
    public String homepage() {
        return "home";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }


    @PostMapping("/register")
    public String userSignup(HttpServletRequest request, Model model) {
        String userName = request.getParameter("userName");
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        Long phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));

        model.addAttribute("userName", userName);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("password", password);
        model.addAttribute("address", address);
        model.addAttribute("phoneNumber", phoneNumber);

        User user1 = new User(userName, name, age, password, address, phoneNumber);
        userService.save(user1);
        model.addAttribute("message", "successfully registered");
        return "register";
    }

    @PostMapping("/login")
    public String userSignIn(Model model, HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
//        String name=request.getParameter("name");

        User user2 = userService.findById(userName);

        if (userService.usernameExistsById(userName)) {
            if (Objects.equals(userService.findById(userName).getPassword(),password)) {
                model.addAttribute("message", "Successfully logged in");
                model.addAttribute("userName",userName);
                model.addAttribute("name",userService.findById(userName).getName());
                model.addAttribute("movieList",movieService.listAllMovies());
                return "movies";
            } else {
                model.addAttribute("error", "Invalid Password..!");
                return "login";
            }
        } else {
            model.addAttribute("error2", "Invalid Credentials..!");
            return "login";
        }
    }



}

