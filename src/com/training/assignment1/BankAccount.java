package com.training.assignment1;

public class BankAccount {

    protected String accountNumber;
    protected double balance;
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(10000);

        bankAccount.deposit(5000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(1000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(1000);
        System.out.println(bankAccount.getBalance());

    }
}
