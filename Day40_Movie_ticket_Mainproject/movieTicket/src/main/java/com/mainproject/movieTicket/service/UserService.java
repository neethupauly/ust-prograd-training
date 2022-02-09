package com.mainproject.movieTicket.service;

import com.mainproject.movieTicket.entity.User;
import com.mainproject.movieTicket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

    public List<User> listAllUser(){
        return userRepository.findAll();
    }

    public User findById(String userName){
        return userRepository.getById(userName);

    }

    public boolean usernameExistsById(String userName) {
        return userRepository.existsById(userName);

    }
}
