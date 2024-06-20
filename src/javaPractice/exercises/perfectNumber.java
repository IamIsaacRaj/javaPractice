package javaPractice.exercises;

import java.util.Scanner;

public class perfectNumber {

    public static void main(String[] args) {

/*  A perfect number is a positive integer that is equal to the sum
    of its proper divisors, excluding itself.
    A. 6: The divisors of 6 (excluding 6 itself) are 1, 2, and 3.
    Summing these, we get 1 + 2 + 3 = 6.
    B. 28: The divisors of 28 (excluding 28 itself) are 1, 2, 4, 7, and 14.
    Summing these, we get 1 + 2 + 4 + 7 + 14 = 28.
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= number/2; i++){
            if(number % i == 0){
                sum += i;
            }
        }

        if(sum == number){
            System.out.println("The number " + number + " is a Perfect number");
        }else {
            System.out.println("The number " + number + " is NOT a Perfect number");
        }
    }
}

/*  Time Complexity: O(number)
    Space Complexity: O(1)
*/
