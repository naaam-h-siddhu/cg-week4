package com.exception.bank;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String mes){
        super(mes);
    }
}
