package com.example.bank.ABCbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    private Long accountNumber;
    @Column(nullable = false)
    private String branch;
    @Column(nullable = false)
    private String ifsc;
    @Column(nullable = false)
    private String accountType;

    public Account(Long accountNumber, String branch, String ifsc, String accountType) {
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.ifsc = ifsc;
        this.accountType = accountType;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
