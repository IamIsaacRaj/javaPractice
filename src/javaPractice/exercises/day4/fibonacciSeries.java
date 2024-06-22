package javaPractice.exercises.day4;

import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args) {
/*
    The Fibonacci series is a sequence of numbers where each number is the
    sum of the two preceding ones, usually starting with 0 and 1.
    That is, the sequence follows the rule:
    F(n)=F(n−1)+F(n−2) with initial values F(0)=0 and F(1)=1.
*/
//  write the code Print the Fibonacci numbers in the range 1 to 1000

        int first = 0, second = 1;
        System.out.println("Fibonacci series from 1 to 1000:");

        while (first <= 1000) {
            if (first >= 0) {
                System.out.print(first + " ");
            }
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
//  to print n number of terms in fibonacci series

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();

        if (number <= 0){
            System.out.println("Please Enter the Positive Number");
        }else {
            int first1 = 0, second1 = 1;
            System.out.println("Fibonacci series up to " + number + " terms:");
            for(int i = 0; i < number; i++){
                System.out.print(first1 + " ");
                int next1 = first1 + second1;
                first1 = second1;
                second1 = next1;
            }
        }
    }
}
