package com.exception.exceptionpropagation;

public class Main {
    public static int method1(int a, int b)throws ArithmeticException{
        System.out.println("Inside method 1");
        if(b == 0)
            throw new ArithmeticException("B id zero");
        return a/b;
    }
    public static void method2(){
        System.out.println("Inside method 2");
        method1(10,0);

    }

    public static void main(String[] args) {
        try{
            method2();
        }catch (ArithmeticException e){
            System.out.println("Handled the exception in main");
        }
    }
}
