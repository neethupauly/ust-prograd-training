package com.example.BeanCount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class BeanCountApplication {

	public static void main(String[] args) {
		ApplicationContext  context=SpringApplication.run(BeanCountApplication.class, args);
		String[] beanNames=context.getBeanDefinitionNames();

		int createdBean=context.getBeanDefinitionCount();

		for(String names: beanNames){
			System.out.println(names);
		}

		System.out.println("Count of beans created "+createdBean);
	}

}

//	Create a simple spring boot application using spring intializr and display the count of beans defined
//	in the factory and to display the name of all the beans in the factory

//		int count=0;
//		for(String bean : beanCount){
//			count++;
//		}

