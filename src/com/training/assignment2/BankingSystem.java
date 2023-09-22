package com.training.assignment2;

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 500.0, 200.0);

        // Display account information
        savingsAccount.displayAccountInfo();
        System.out.println("---------------------------");
        checkingAccount.displayAccountInfo();
        System.out.println("---------------------------");

        // Perform transactions
        savingsAccount.calculateInterest();
        savingsAccount.displayAccountInfo();
        System.out.println("---------------------------");

        checkingAccount.withdrawWithOverdraft(800.0);
        checkingAccount.displayAccountInfo();
    }
}
