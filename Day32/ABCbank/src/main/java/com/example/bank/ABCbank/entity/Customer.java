package com.example.bank.ABCbank.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {

    @Id
    private Long accountNumber;
    @Column(nullable = false)
    private String customerName;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    private String branch;
    @Column(nullable = false,unique = true)
    private Long phoneNumber;
    private double balance=5000.0;

    public Customer(){

    }

    public Customer(Long accountNumber, String customerName, String userName, String password, String branch, Long phoneNumber) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.userName = userName;
        this.password = password;
        this.branch = branch;
        this.phoneNumber = phoneNumber;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
