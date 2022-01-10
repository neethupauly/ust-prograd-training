package com.example.bank.ABCbank.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    private String userName;
    @Column(nullable = false)
    private String customerName;
    @Column(nullable = false)
    private String password;
    private String address;
    @Column(nullable = false,unique = true)
    private Long phoneNumber;

    @JsonIgnore
    @OneToOne
    private Account account;

    public Customer(){

    }

    public Customer( String customerName, String userName, String password, String address,  Long phoneNumber) {

        this.customerName = customerName;
        this.userName = userName;
        this.password = password;
        this.address=address;
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


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
