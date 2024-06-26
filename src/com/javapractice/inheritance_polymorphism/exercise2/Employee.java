package com.javapractice.inheritance_polymorphism.exercise2;

public class Employee {

    int employeeId;
    String employeeName;
    char gender;
    byte age;
    double salary;

    public Employee(){
        employeeId = 0;
        employeeName = "Unknown";
        gender = 'U';
        age = 0;
        salary = 0.0;
    }

    public Employee(int employeeId, String employeeName, char gender, byte age, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    void displayEmployeeInfo(){
        System.out.println("Employee Details...");
        System.out.println("employeeId = " + employeeId);
        System.out.println("employeeName = " + employeeName);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("salary = " + salary);
    }

    public double calculateBonus(){
        return 0.0;
    }

    public double calculateTotalSalary() {
        return salary + calculateBonus();
    }

}
