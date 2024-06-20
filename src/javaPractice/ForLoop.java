package javaPractice;

public class ForLoop {
    public static void main(String[] args) {
/*  A for loop in Java is a control flow statement that allows code
    to be executed repeatedly based on a condition. It is typically used
    when the number of iterations is known beforehand. The for loop includes
    initialization, condition, and increment/decrement in a single line,
    making it compact and easy to understand.
    Syntax:
    for (initialization; condition; update) {
    // code block to be executed
     }
*/
        for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);
        }

//      Loop Through an Array
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + " is: " + numbers[i]);
        }

//      Nested for Loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

//        using break and continue statements
/*  break Statement
    The break statement is used to terminate the loop or switch statement prematurely.
    When a break statement is encountered inside a loop, the loop is immediately
    terminated, and the control is transferred to the next statement following the loop.
*/
        for (int a = 1; a <= 3; a++) {
            for (int  b= 1; b <= 3; b++) {
                if(a == b) break;
                System.out.println("a = " + a + ", b = " + b);
            }
        }

/*  continue Statement
    The continue statement is used to skip the current iteration of a loop
    and proceed to the next iteration. When a continue statement is encountered
    inside a loop, the remaining code inside the loop for the current iteration
    is skipped, and the loop proceeds with the next iteration.
*/

        for (int x = 1; x <= 3; x++) {
            for (int  y= 1; y <= 3; y++) {
                if(x == y) continue;
                System.out.println("x = " + x + ", y = " + y);
            }
        }

/*
    for-each Loop
    The enhanced for loop is designed for iterating over arrays or collections.
    It simplifies the code and eliminates the need for explicit counters.
*/
        int[] values  = {1, 2, 3, 4, 5};

        for(int value : values){
            System.out.println("value is : " + value);
        }
    }
}
