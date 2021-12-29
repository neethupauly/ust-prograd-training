package com.example.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CalculatorApplication.class, args);

		Calculator calculator=context.getBean(Calculator.class);

        System.out.println("Result after Addition  "+ calculator.add());
        System.out.println("Result after Subtraction  "+calculator.subtract());
        System.out.println("Result after Multiplication  "+calculator.multiply());
        System.out.println("Result after Division  "+calculator.divide());



	}
}




//	Create a simple spring boot application and add a class to implement calculator functionalities.
//	Fetch the inputs required from application.properties file. use @component and @value annotations

