package javaPractice;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

/*  A while loop is a control flow statement in programming that allows
    code to be executed repeatedly based on a given Boolean condition.
    The loop continues to execute as long as the specified condition
    evaluates to True.When the condition evaluates to False, the loop stops.
    Syntax:
    while (condition) {
     code block to be executed
        }
*/
        int count = 0;

        while (count < 5){
            System.out.println("Count : " + count);
            count++;
        }
//  Using the break statement to exit an infinite while loop prematurely:
        int num = 0;
        while (true){
            System.out.println("Numbers : " + num);
            num++;
            if (num > 3) break;
        }

/*
    A do-while loop in Java is similar to a while loop but with one key
    difference: the condition is checked after the code block is executed.
    This ensures that the code block is executed at least once,
    even if the condition is initially false.
    Syntax

    do {
        // code block to be executed
    } while (condition);
*/
        int value = 6;
        do {
            System.out.println("value = " + value);
            value++;
        }while (value < 5);

//      Using do-while Loop for User Input Validation
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number between 1 - 10 : ");
            number = scanner.nextInt();
        }while (number < 1 || number > 10);

/*  if the number is not in range of 1 - 10 the condition becomes true
    so the loop repeats itself until we enter a number in the range 1-10
    the condition becomes false thus exits the loop and print the number
*/
        System.out.println("you have entered the number = " + number);

    }
}
