package com.javapractice.exceptions;

public class ArrayIndexException {

    public static void main(String[] args) {
         try{
             int [] arr = new int[5];
             arr[10] = 20;
         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
         }
    }
}
