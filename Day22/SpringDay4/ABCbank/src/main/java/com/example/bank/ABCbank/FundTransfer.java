package com.example.bank.ABCbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FundTransfer {

//    @Autowired
//    Account balance;
    double amountOfTransfer;
    double amountFromAccount;
    double amountToAccount;

    public double getBalanceAfterTransfer(double balance) {
        balance=amountOfTransfer+balance;
        return balance;
    }

    public double setAmountOfTransfer(double amountOfTransfer) {
        this.amountOfTransfer = amountOfTransfer;
        return amountOfTransfer;
    }
    public double transferFromAccountOne(double amount) {
        amount=amountFromAccount-amount;
        return amount;
    }
    public double transferToAccountTwo(double amount) {
        amount=amountToAccount+amount;
        return amount;
    }
}
