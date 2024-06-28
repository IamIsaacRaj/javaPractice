package com.javapractice.exceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String string = null;
            System.out.println("string length = " + string.length());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
