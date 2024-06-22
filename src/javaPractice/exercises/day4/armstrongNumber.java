package javaPractice.exercises.day4;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
/*  An Armstrong number is a number that is equal to the sum of its own digits
    each raised to the power of the number of digits.
    1-Digit Armstrong Numbers:
    Every single-digit number is trivially an Armstrong number because
    any number raised to the power of one is itself.

    2-Digit Armstrong Numbers:
    There are no 2-digit Armstrong numbers.

    3-Digit Armstrong Numbers:
    153: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

    Digit Armstrong Numbers:
    1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634

 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();

        String digits = Integer.toString(number);
        int numOfDigits = digits.length();

        int originalNumber = number;
        int result = 0;
        int reminder;
        while (originalNumber != 0){
            reminder = originalNumber % 10;
            result  += (int) Math.pow(reminder,numOfDigits);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong Number");
        else
            System.out.println(number + " is Not an Armstrong Number");
    }
}
