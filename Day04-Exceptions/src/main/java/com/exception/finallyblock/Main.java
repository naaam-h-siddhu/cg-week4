package com.exception.finallyblock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int c = 0;
        try{
            c = a/b;
            System.out.println(a+" / "+b+" = "+c);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {

            System.out.println("Operation Completed");
        }
    }
}
