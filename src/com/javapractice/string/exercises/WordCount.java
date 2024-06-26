package com.javapractice.string.exercises;

public class WordCount {
    public static int noOfWords(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    public static void main(String[] args) {

//  Write a Java Program to count the number of words in a String?

        String string = """
                Strings are a fundamental part of Java programming
                 and are widely used in various applications.
                """;
        System.out.println(string);

        int numOfWords = noOfWords(string);

        System.out.println("Number Of Words in the string = " + numOfWords);

    }
}
