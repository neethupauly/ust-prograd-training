package com.example.bank.ABCbank;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    String customerName;
    String accountNumber;
    String ifscCode;

//    @Autowired
//    private Account balance;

    public String setCustomerName(String customerName) {
        this.customerName = customerName;
        return customerName;

    }

    public String  setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    public String setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
        return ifscCode;

    }


}

