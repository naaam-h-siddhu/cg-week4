package com.exception.throwvsthrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static double calculateInterest(double amount, double rate, int years)throws IllegalArgumentException{
        if(amount < 0 || rate < 0 || years <0 ){
            throw  new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }

        return (amount*rate*years)/100;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the amount: ");
            double amount = sc.nextDouble();
            System.out.println("Enter the Rate of Interest: ");
            double rate = sc.nextDouble();
            System.out.println("Enter the time period: ");
            int year = sc.nextInt();

            System.out.println("total interest "+calculateInterest(amount,rate,year));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Invalid input type " + e.getMessage());

        }finally {
        sc.close();
        }
    }
}
