package com.exception.runtime;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean flag = false;
        int number1= 0,number2 = 0;
        while(!flag){
            System.out.println("Enter the first number !");
            try{
                number1 = sc.nextInt();
                flag = true;
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.next();
            }
        }
        flag = false;
        while (!flag){
            System.out.println("Enter the second number !");
            try{
                number2 = sc.nextInt();
                flag = true;
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());

            }

        }

        try {
            int c = number1/number2;
            System.out.println(number1+" / "+number2+" = "+c);

        }catch (ArithmeticException e){
            System.out.println("Divide by 0 exception");
        }


    }
}
