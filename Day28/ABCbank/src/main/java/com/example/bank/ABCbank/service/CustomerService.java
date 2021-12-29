package com.example.bank.ABCbank.service;


import com.example.bank.ABCbank.entity.Customer;
import com.example.bank.ABCbank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bank.ABCbank.entity.Customer;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;


    public Customer save(Customer customer){
        ArrayList<String> details=new ArrayList<>(List.of("Neethu Pauly","ABC109884740","abc@123","Ernakulam"));

        repository.findById(customer.getAccountNumber());
        return repository.save(customer);
    }

    public List<Customer> listAll(){
        return repository.findAll();

    }
}
