//Create a Spring Boot application for ABC Bank. using this application,
//the customers of the bank should be able to access their account details
//and transfer funds to the other accounts of the same bank.
//This application should consist of the following entities:
//Customer:To store information about the customers of the bank
//Account:To store information about the existing accounts of the bank
//FundTransfer:To store information about the funds that are transferred from one account to the other.
//Create the application and inject dependencies in the entities.

package com.example.bank.ABCbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;


@SpringBootApplication
public class AbCbankApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(AbCbankApplication.class, args);

		System.out.println("Select the choice for : ");
		System.out.println("1)View Account Details");
		System.out.println("1)View Balance in your account");
		System.out.println("1)Transfer Money");

		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch (choice){
			case 1:

		}
		Customer customer1=context.getBean(Customer.class);
		System.out.println("Enter the customer details");
		System.out.println("Enter the Account holder Name");
		String name=customer1.setCustomerName(sc.nextLine());
		System.out.println("Enter the Account Number");
		String accno=customer1.setAccountNumber(sc.nextLine());
		System.out.println("Enter the IFSC Code");
		String ifsc=customer1.setIfscCode(sc.nextLine());
		Account account=context.getBean(Account.class);
		double balance=account.getBalance();
		System.out.println("Account holder name :"+name);
		System.out.println("Account number :"+accno);
		System.out.println("IFSC Code :"+ifsc);
		System.out.println("Balance :"+balance);



		FundTransfer fundTransfer=context.getBean(FundTransfer.class);
		System.out.println("Enter the amount you wish to transfer");
		double transferringAmount=fundTransfer.setAmountOfTransfer(sc.nextDouble());
		double balanceAfterTransfer=fundTransfer.setAmountOfTransfer(transferringAmount);
		System.out.println("Balance in Account after Transfer  :"+fundTransfer.getBalanceAfterTransfer(balanceAfterTransfer));

		double fromAccount=fundTransfer.transferFromAccountOne(sc.nextDouble());
		double ToAccount


	}


}
