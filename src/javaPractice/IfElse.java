package javaPractice;


public class IfElse {
    public static void main(String[] args) {

/*  if statement is used to execute a block of code only if a specified condition is true. 
        It is a fundamental control flow statement that helps in decision-making.
*/  
/* The if-else statement works as follows:
        If the condition evaluates to true, the code inside the if block is executed.
        Else (if the condition evaluates to false), the code inside the else block is executed. 
*/
/* Exercise 1:
        Write a program that checks if a person is eligible to vote. The eligible age for voting
        is 18 years or older. 
*/
        byte age = 24;
        if (age > 18) {
            System.out.println("you are Eligible to vote");
        }else{
            System.out.println("you are not Eligible to vote");
        }

/*  Exercise 2:
         Write a program that assigns grades based on a student's score.
 */
        int score = 85;
        char grade;
        if( score  >= 90){
            grade = 'A';
        }else if(score >= 80 & score < 90){
            grade = 'B';
        }else if(score >= 70 & score < 80){
            grade = 'C';
        }else if(score >= 60 & score < 70){
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println("Grade : " + grade);
    }
}
