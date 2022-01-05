package com.Aop.demoAop;


public class Doctor {
    private int name;
    private Long phoneNumber;

    public Doctor(){

    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void display(){
        System.out.println(Patient.appointment());
    }
}
