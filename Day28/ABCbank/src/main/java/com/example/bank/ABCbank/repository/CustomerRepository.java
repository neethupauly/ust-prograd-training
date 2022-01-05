package com.example.bank.ABCbank.repository;

import com.example.bank.ABCbank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
