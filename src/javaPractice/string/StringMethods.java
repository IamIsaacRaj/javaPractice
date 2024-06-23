package javaPractice.string;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

//  Length: Returns the length of this string.
        String str = "Hello World!";
        int length = str.length();
        System.out.println("length of the string = " + length);

//  isEmpty(): Returns true if, and only if, length() is 0
        boolean isEmpty = str.isEmpty();
        System.out.println("is the String str Empty = " + isEmpty); // false

        String str0 = "";
        boolean isEmpty0 = str0.isEmpty();
        System.out.println("is the String str0 Empty = " + isEmpty0); // true

//  charAt(int index):Returns the character at the specified index.

        char ch = str.charAt(0);  // 'H'
        System.out.println("Character at index 0:= " + ch);

//  indexOf(int ch):Returns the index within this string of the first occurrence of
//  the specified character.

        int chIndex = str.indexOf('o');
        System.out.println("Character 'o' Index of first occurrence in string = " + chIndex); // 4

//  lastIndexOf(int ch):Returns the index within this string of the
//  last occurrence of the specified character.

        int lastIndexCh = str.lastIndexOf('o');
        System.out.println("Character 'o' Index of last occurrence in string = " + lastIndexCh);

//  indexOf(String str):Returns the index within this string of the first occurrence of
//  the specified substring.

        String string = "I love Java.If you do not love Java i don\\'t blame you";
        int strIndex = string.indexOf("Java");
        System.out.println("Substring 'Java' Index of first occurrence in string = " + strIndex); // 7

//  lastIndexOf(String str):Returns the index within this string of the last occurrence of
//  the specified substring.

        int strLastIndex = string.lastIndexOf("Java");
        System.out.println("Substring 'Java' Index of last occurrence in string  = " + strLastIndex); // 31

//  substring(int beginIndex, int endIndex):
//  Returns a new string that is a substring of this string.

        String substring = str.substring(6); // Substring from index 6 to the end.

        System.out.println("substring = " + substring); // World!
        String substring2 = str.substring(0, 5);
        System.out.println("substring2 = " + substring2); // Hello

//  Contains:Returns true if and only if this string contains
//  the specified sequence of char values.
        boolean contains = str.contains("Hello");
        boolean contains2 = str.contains("java");

        System.out.println(contains); // true
        System.out.println(contains2); // false

//  replace(CharSequence target, CharSequence replacement):
//  Returns a string resulting from replacing all occurrences of
//  oldChar in this string with newChar.

        String replacedStr = str.replace('o','a');
        System.out.println("replaced String with char = " + replacedStr); //Hella Warld!

        String replacedStr1 = str.replace("Hello", "Hi..!");
        System.out.println("replaced String with word = " + replacedStr1);

//  split(String regex): Splits this string around matches of the given regular expression.
        String str1 = "Hi/!/I/am/Raju";
        String[] words = str1.split("/");
        System.out.println("Words = " + Arrays.toString(words)); //[Hi, !, I, am, Raju]

//  trim():
//  Returns a copy of the string, with leading and trailing whitespace omitted.
        String str2 = "  Hello, World!  ";
        String trimmedStr = str2.trim();  // "Hello, World!"
        System.out.println("Trimmed String = " + trimmedStr);

//  toUpperCase():Converts all of the characters in this string to upper case.
        String upperStr = str.toUpperCase();  // "HELLO WORLD!"
        System.out.println("String to UpperCase = " + upperStr);

//  toLowerCase():Converts all of the characters in this string to lower case.
        String lowerStr = str.toLowerCase();  // "hello world!"
        System.out.println("String to lowerCase = " + lowerStr);

    }
}
