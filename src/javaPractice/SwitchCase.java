package javaPractice;

public class SwitchCase {
    public static void main(String[] args) {
/*   Exercise 3: Day of the Week Activities
     Write a program that suggests activities based on the day of the week.
     declare an integer variable named day (1 for Monday, 2 for Tuesday, ..., 7 for Sunday).
     Use a switch statement to suggest activities for each day of the week.
        • Monday: "Gym"
        • Tuesday: "Yoga"
*/
/*   Definition
        The switch statement evaluates a single expression and compares its value
        against a list of possible cases. When a match is found, the corresponding
        block of code is executed. Optionally, a default case can be included to
        handle values that don't match any of the specified cases.
*/
        int day = 5;

        String activity = "No activity";
        String dayOfWeek = "Invalid day";

        switch (day){
            case 1:
                dayOfWeek = "Monday";
                activity = "Gym";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                activity = "Yoga";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                activity = "Swimming";
                break;
            case 4:
                dayOfWeek = "Thursday";
                activity = "Reading";;
                break;
            case 5:
                dayOfWeek = "Friday";
                activity = "Movies";
                break;
            case 6:
                dayOfWeek = "Saturday";
                activity = "Hiking";
                break;
            case 7:
                dayOfWeek = "Sunday";
                activity = "Resting";
                break;
            default :
                System.out.println("Please enter the number from 1 - 7");
                break;
        }

        System.out.println("Day: " + dayOfWeek);
        System.out.println("Suggested activity: " + activity);

    }
}
