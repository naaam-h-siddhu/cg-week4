package com.exception.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount(10000);
        try {
            sbi.withdraw(5000);
            sbi.withdraw(-500);
            sbi.withdraw(50000);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
