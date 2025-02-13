package com.bankingsystem;

import java.util.*;
public class Bank {


    HashMap<Long,Double> accounts = new HashMap<>();
    TreeMap<Double,Long> sortedBalance = new TreeMap<>();
    Queue<WithdrawlRequest> withdrawlRequests = new LinkedList<>();

    private static class WithdrawlRequest {
        long accountNumber;
        double amount;

        public WithdrawlRequest(long accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }
    }

    public void addAccount(long accountNumber, double amount){
        //add in hm
        accounts.put(accountNumber,amount);

        //add in tm for sorted balance
        sortedBalance.put(amount,accountNumber);
    }

    public void processWithdraw(long accountNumber, double amount){
        withdrawlRequests.add(new WithdrawlRequest(accountNumber,amount));
    }

    public void processAllWithdrawls(){
        while (!withdrawlRequests.isEmpty()){
            WithdrawlRequest request = withdrawlRequests.poll();

            if(accounts.containsKey(request.accountNumber)) {
                double balance = accounts.get(request.accountNumber);

                if (balance >= request.amount) {
                    accounts.put(request.accountNumber, balance - request.amount);
                } else {
                    System.out.println("insufficient balance");
                }
            }
            else {
                System.out.println("Account number not matched!! " +
                        "Retry");
            }
        }
    }

    public void displayDetails(){
        accounts.forEach((key,value) -> {
            System.out.println("Account No. : "+key+" Balance: "+value);
        });
    }

    public void sortWithBalance(){
        sortedBalance.forEach((key,value) -> {
            System.out.println("Account No. : "+key+" Balance: "+ value);
        });
    }

}
