package com.exception.customexception;

import java.util.Scanner;

class InvalidException extends Exception{
    public InvalidException(String message){
        super(message);
    }

}

public class Main {
    public static void validateAge(int age)throws InvalidException{
        if(age<18){
            throw new InvalidException("Age must be less that 18");
        }else{
            System.out.println("Ready to vote!!1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age !");
        int age = sc.nextInt();
        try{
            validateAge(age);
        }catch (InvalidException e){
            System.out.println(e.getMessage());
        }


    }

}
