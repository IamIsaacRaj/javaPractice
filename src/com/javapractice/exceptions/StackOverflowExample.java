package com.javapractice.exceptions;

public class StackOverflowExample {
    public static void recursiveMethod(){
        recursiveMethod();
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        }catch (StackOverflowError e){
            System.out.println("StackOverFlowError caught :  = " + e.getMessage());
        }
    }
}
