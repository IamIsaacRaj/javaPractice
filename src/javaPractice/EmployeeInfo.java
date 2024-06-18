package javaPractice;

public class EmployeeInfo {
    public static void main(String[] args) {
        System.out.println("Primitive Data Types/ variables in Java:");

/*
    String: A sequence of characters used to store textual data.
    It is an object in Java and not a primitive type.
*/
        String employeeName;
        employeeName = "Raju";
        System.out.println("Employee Name : " + employeeName);

//  char: A 16-bit Unicode character. It is used to store a single character.
        char gender;
        gender = 'M';
        System.out.println("Gender : " + gender);

/*
    boolean: A type with two possible values, true or false.
    It is used for simple flags that track true/false conditions.
*/
        boolean isPermanentEmployee;
        isPermanentEmployee = true;
        System.out.println("Permanent Employee : " + isPermanentEmployee);

//  byte: An 8-bit signed integer. It has a minimum value of -128 and a maximum value of 127.
        byte age;
        age = 24;
        System.out.println("Employee Age : " + age);

//  short: A 16-bit signed integer. It has a minimum value of -32,768 and a maximum value of 32,767.
        short perMonthSalary;
        perMonthSalary = 27000;
        System.out.println("Salary per month : " + perMonthSalary);

//  int: A 32-bit signed integer. It is one of the most commonly used data types to store whole numbers.
        int annualSalary;
        annualSalary = 324000;
        System.out.println("Annual salary : " + annualSalary);

/*
    float: A single-precision 32-bit IEEE 754 floating point.
    It is used to save memory in large arrays of floating point numbers.
    By default, floating-point literals are of type double.
    To specify a float literal, use a suffix f or F.
*/
        float bonus;
        bonus = 3585.50F;
        System.out.println("Bonus : " + bonus);

//  long: A 64-bit signed integer. It is used when a wider range than int is needed.
        long employeeId;
        employeeId = 110085249761L;
        System.out.println("Employee Id :" + employeeId);

/*
  double: A double-precision 64-bit IEEE 754 floating point.
  It is generally used for decimal values just like float.
*/
        double averageAnnualIncome;
        averageAnnualIncome = 3245404.50;
        System.out.println("Average Annual Income : " + averageAnnualIncome);
    }
}
