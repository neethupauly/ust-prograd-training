package com.example.bank.ABCbank;

import org.springframework.stereotype.Component;

@Component
public class Account {

    public  double balance=2000;

    public double getBalance() {
        return balance;
    }


}
