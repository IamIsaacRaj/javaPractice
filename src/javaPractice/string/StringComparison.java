package javaPractice.string;

public class StringComparison {
    public static void main(String[] args) {
/*  4.String Pool
    Java optimizes memory usage by maintaining a pool of strings.
    When you create a string literal, Java checks the pool first.
    If the string already exists in the pool, the reference to
    the existing string is returned. Otherwise, a new string is created
    and added to the pool.
*/
        String strA = "Hello";
        String strB = "Hello";
        String strC = new String("Hello");// strC creates new string object even though content is same
        String StrD = new String("world");

/*  5. Comparing Strings
    1.Using ==: Compares the reference, not the content.
    str1 == str2 is true because both references point to the same object
    in the string pool  */

        System.out.println(strA == strB); // true

//  2.Using equals(): Compares the content of the strings.
        System.out.println(strA.equals(strC)); //true

/*  3.Using compareTo(): Compares lexicographically.
    When comparing two strings lexicographically:
    1.The comparison is performed character by character.
    2.Each character is compared based on its Unicode value.
    3.The comparison starts with the first character of each string
    and proceeds to the next character if the characters are equal.
    4.compareTo() method works as
    If the first string comes before the second string lexicographically,
    compareTo() returns a negative integer.
    If the first string comes after the second string lexicographically,
    compareTo() returns a positive integer.
    If both strings are equal, compareTo() returns 0.
*/
        String str = "apple";
        String str1 = "banana";

        int result = str.compareTo(str1);
        int result1 = str1.compareTo(str);
        System.out.println("result = " + result);
        //compareTo returns a -ve integer (-1) because 'a' is less than 'b'
        // "apple" comes before "banana"

        System.out.println("result1 = " + result1);
        //compareTo returns a +ve integer (1) because 'b' is greater than 'a'
        // "banana" comes after "apple"

        String str2 = "apple";

        int result2 = str.compareTo(str2);  // compareTo returns 0
        System.out.println("result2 = " + result2);
        // Output will be 0 because both strings are equal

        String str3 = "Apple";

        int result3 = str3.compareTo(str2);// compareTo returns a -ve integer(-32)
        System.out.println("result3 = " + result3);
        // Output will be a negative number because "Apple" (uppercase A)
        // comes before "apple" (lowercase a)

        int result4 = str2.compareTo(str3); // compareTo returns a +ve integer(32)
        System.out.println("result4 = " + result4);
        // Output will be a negative number because "apple" (lowercase a)
        // comes After "Apple" (uppercase A)

    }
}
