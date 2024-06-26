package com.javapractice.inheritance_polymorphism.exercise2;

public class Manager extends Employee{

    double bonusPercentage;

    public Manager(){
        super();
    }

    public Manager(int employeeId, String employeeName, char gender, byte age, double salary, double bonusPercentage) {
        super(employeeId, employeeName, gender, age, salary);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateBonus() {
        return salary * bonusPercentage/100  ;
    }
    @Override
    void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("bonusPercentage = " + bonusPercentage);
        System.out.println("calculated bonus = " + calculateBonus());
        System.out.println("Salary with bonus = " + calculateTotalSalary());
    }



}
