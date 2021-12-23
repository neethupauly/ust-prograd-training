package com.example.BeanCount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bean {

    @Autowired
    public Bean(){
        System.out.println("Bean object created");
    }
}


