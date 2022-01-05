package com.example.bank.ABCbank.service;


import com.example.bank.ABCbank.entity.Customer;
import com.example.bank.ABCbank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer save(Customer customer){
//        ArrayList<String> details=new ArrayList<>(List.of("Neethu Pauly","ABC109884740","abc@123","Ernakulam"));
//        repository.findById(customer.getAccountNumber());
        return repository.save(customer);
    }

    public List<Customer> listAll(){
        return repository.findAll();

    }

    public Customer findById(Long accountNumber) {
       return repository.getById(accountNumber);

    }
    public boolean existsById(Long accountNumber){
        return repository.existsById(accountNumber);
    }


}
