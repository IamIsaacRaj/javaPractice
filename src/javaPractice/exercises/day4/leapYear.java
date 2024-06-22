package javaPractice.exercises.day4;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
/*  A leap year is exactly divisible by 4 except for century years
    (years ending with 00). The century year is a leap year
    only if it is perfectly divisible by 400.
*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year = scanner.nextInt();
        boolean leapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leapYear = true;
                else
                    leapYear = false;
            }else {
                leapYear = true;
            }
        }else{
            leapYear = false;
        }

        if (leapYear)
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is Not a Leap Year");
    }
}
