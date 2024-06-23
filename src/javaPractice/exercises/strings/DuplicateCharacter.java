package javaPractice.exercises.strings;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;


public class DuplicateCharacter {
    public static void main(String[] args) {
//  Write a Java program to print duplicate characters from String?

        String string = "Hello world!";

        // Create a HashMap to store the character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over each character in the string
        for (char ch : string.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print characters that appear more than once
        System.out.println("Duplicate characters in the string are:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }

    }
}
