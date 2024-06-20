package javaPractice.exercises;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
/*  Prime numbers are the numbers that have only two factors,
    that are, 1 and the number itself.
    code 1: check if the given number is prime or not
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();
        int factorCount = 0;
        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0)
                factorCount++;
        }

        if (factorCount == 2)
            System.out.println(number + " is  Not Prime Number");
        else
            System.out.println(number + " is a Prime Number");
// To print prime numbers for given range ex: 1 -100

        System.out.println("Enter the range : ");
        int range = scanner.nextInt();

        for (int i = 1; i < range; i++) {
            boolean isPrime = isPrime(i);
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if( num <= 1)
            return false;
        for(int i = 2; i <= Math.sqrt(num) ; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
