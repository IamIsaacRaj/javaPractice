package com.javapractice.inheritance_polymorphism.exercise2;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee = new Employee(100,"Ashok",'M',(byte) 24,45000);
        Employee manager = new Manager(200,"Swathi",'F',(byte)22,60000,10);
        Employee developer = new Developer(300,"RaghuVaran",'M',(byte) 28,65000,5000);

        System.out.println("Employee Info:");
        employee.displayEmployeeInfo();

        System.out.println("Manager Info:");
        manager.displayEmployeeInfo();

        System.out.println("\nDeveloper Info:");
        developer.displayEmployeeInfo();
    }
}
