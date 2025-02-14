package com.exception.multiplecatch;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int lastnumber = -1;
        try{
            lastnumber = array[3];
            System.out.println("value at 3: "+lastnumber);
        }catch (NullPointerException e){
            System.out.println("Array is not initialized ");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid Index !");
        }
    }
}
