package com.Aop.demoAop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Patient {
    private int age;
    private String name;
    private String gender;

    @Autowired
    private Doctor tokenNo;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doctor getTokenNo() {
        return tokenNo;
    }

    public void setTokenNo(Doctor tokenNo) {
        this.tokenNo = tokenNo;
    }

    public static void appointment(){
        System.out.println("Appointment added");
    }

}
