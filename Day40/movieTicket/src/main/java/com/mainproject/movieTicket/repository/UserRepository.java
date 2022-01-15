package com.mainproject.movieTicket.repository;

import com.mainproject.movieTicket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
