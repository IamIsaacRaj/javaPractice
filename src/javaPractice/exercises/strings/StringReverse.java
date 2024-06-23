package javaPractice.exercises.strings;

public class StringReverse {

    public static String reverseString(String[] str){
        if (str == null) {
            return null;
        }
        String[] newArray = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            newArray[i] = str[str.length-1-i];
        }
         return String.join("", newArray);


    }
    public static void main(String[] args) {
//  Write a Java program to reverse a String without using inbuilt functions (Palindrome).

        String string = "Hello World!";

        System.out.println("Original string = " + string);

        String[] stringArray = string.split("");

        String reversedString = reverseString(stringArray);

        System.out.println("reversed String = " + reversedString);

    }
}
