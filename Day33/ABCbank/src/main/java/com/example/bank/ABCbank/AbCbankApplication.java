//Create a Spring Boot application for ABC Bank. using this application,
//the customers of the bank should be able to access their account details
//and transfer funds to the other accounts of the same bank.
//This application should consist of the following entities:
//Customer:To store information about the customers of the bank
//Account:To store information about the existing accounts of the bank
//FundTransfer:To store information about the funds that are transferred from one account to the other.
//Create the application and inject dependencies in the entities.
//  To avail online services of the bank, the customers have to log in to the
//  website by using their user name and password. After the customers successfully log into
//  the website, they can view their account details on the user account page


package com.example.bank.ABCbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;


@SpringBootApplication
public class AbCbankApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AbCbankApplication.class, args);










    }


}
