package com.exception.bank;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws IllegalArgumentException, InsufficientBalanceException{
        if(amount < 0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        if(balance<amount){
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        balance-=amount;
        System.out.println("Withdrawal successful, new balance :"+balance);
    }
}
