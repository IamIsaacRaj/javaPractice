package com.javapractice.string;

public class StringsIntroduction {
    public static void main(String[] args) {
/*  a String is a sequence of characters. Strings are objects in Java,
    which means they are instances of the String class.
    Java strings are immutable, meaning once a string is created,
    it cannot be changed.
*/
//  Creating Strings
//  1.Using String Literals:

        String str = "Hello, World!";

//  2.Using the `New` Keyword

        String str0 = new String("Hello, World!");

/*
    3.String Immutability
    strings in Java are immutable. When you perform operations on a string,
    a new string is created rather than modifying the existing one.
*/
        String originalStr = "Hello";
        originalStr.concat(", world!");
        System.out.println("originalStr = " + originalStr);

//  here we get output as `originalStr = Hello` originalStr is not modified or changed

        originalStr = originalStr.concat(", world!");
        System.out.println("originalStr = " + originalStr);

        String str1 = "Hello";
        String str2 = " World";
        str1 = str1 + str2;  // str1 now holds "Hello World"
        System.out.println("str1 = " + str1);  // Output: Hello World

/*  Concatenation using the + operator or the concat method creates a new string.
    If you use concatenation in an assignment (e.g., str1 = str1 + str2),
    the reference to the original string  (originalStr & str1) is updated to
    point to the new concatenated string. The original string itself is not modified.
*/

    }
}