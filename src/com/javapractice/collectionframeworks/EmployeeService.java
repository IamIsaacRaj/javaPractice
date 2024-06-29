package com.javapractice.collectionframeworks;

public class EmployeeService {
    
    void displayEmployeeDetails(Employee employee){
        System.out.println("Employee Id = " + employee.getId());
        System.out.println("employee Name = " + employee.getName());
        System.out.println("employee Salary = " + employee.getSalary());
        System.out.println("employee Department = " + employee.getDepartment());
        System.out.println("employee Email = " + employee.getEmail());
        System.out.println("employee ContactNum = " + employee.getContactNum());
        System.out.println("----------------------------------------------");
    }
}
