package com.training.assignment2;

import java.text.DecimalFormat;

class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Savings Account");
    }

    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Checking Account");
    }

    public void withdrawWithOverdraft(double amount) {
        double availableBalance = getBalance() + overdraftLimit;
        if (availableBalance >= amount) {
            if (getBalance() >= amount) {
                withdraw(amount);
            } else {
                double overdraftUsed = amount - getBalance();
                balance = 0;
                System.out.println("Overdraft used: $" + overdraftUsed);
            }
        } else {
            System.out.println("Insufficient funds including overdraft limit.");
        }
    }
}

