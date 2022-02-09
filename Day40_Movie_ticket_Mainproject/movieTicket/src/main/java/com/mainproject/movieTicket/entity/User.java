package com.mainproject.movieTicket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {

    @Id
    private String userName;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    private String password;
    private String address;
    @Column(nullable = false,unique = true)
    private Long phoneNumber;

    @OneToMany(mappedBy = "user")
    private List<BookedSeats> bookedSeats;

    public User(String userName, String name, Integer age, String password, String address, Long phoneNumber) {
        this.userName = userName;
        this.name = name;
        this.age = age;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<BookedSeats> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<BookedSeats> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
