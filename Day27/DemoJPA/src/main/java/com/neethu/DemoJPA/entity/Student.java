package com.neethu.DemoJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Long id;
    @Column(nullable = false) //not null
    private String name;
    private String batch;
    private float marks;
    @Column(nullable = false) //not null
    private Integer age;
    @Column(name = "phonenumber",nullable = false,unique = true,updatable = false)
    //name- for changing field name ,not null,unique constraint,should not be updated after first entry of phone number
    private Long phoneNumber;

    public Student(){

    }
    public Student(Long id, String name, String batch, float marks, Integer age, Long phoneNumber) {
        this.id = id;
        this.name = name;
        this.batch = batch;
        this.marks = marks;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
