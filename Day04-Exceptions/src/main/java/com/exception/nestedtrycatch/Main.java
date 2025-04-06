package com.exception.nestedtrycatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the array element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the divisor :");
        int divisor = sc.nextInt();
        try{
            for(int i = 0;i<6;i++){
                try{
                    int ans = arr[i]/divisor;
                    System.out.println(arr[i]+" / "+divisor+" = "+ans);
                    divisor--;
                }catch (ArithmeticException e){
                    System.out.println("Cannot divide by zero !");
                }
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid array index !");
        }
    }
}
