package com.bankingsystem;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Add accounts with initial balances
        bank.addAccount(12345, 5000.00);
        bank.addAccount(67890, 1500.00);
        bank.addAccount(11223, 3000.00);

        // Process withdrawal requests
        bank.processWithdraw(12345, 2000.00);  // Successful
        bank.processWithdraw(67890, 2000.00);  // Insufficient balance
        bank.processWithdraw(11223, 1000.00);  // Successful
        bank.processWithdraw(00000, 500.00);   // Account not found

        // Process all withdrawal requests
        bank.processAllWithdrawls();

        // Display account balances after processing withdrawals
        bank.displayDetails();

        //in sorted balance
        System.out.println("sorted");
        bank.sortWithBalance();
    }
}
