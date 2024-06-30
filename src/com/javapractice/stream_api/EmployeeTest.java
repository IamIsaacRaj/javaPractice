package com.javapractice.stream_api;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        EmployeeRepository employeeRepository = new EmployeeRepository();
        EmployeeService employeeService = new EmployeeService(employeeRepository);

        List<Employee> employeeList = employeeService.getEmployees();

//      employeeList.forEach(employee -> System.out.println(employee)); both are same
        employeeList.forEach(System.out::println);
        System.out.println();

        System.out.println("Employees filtered by salary");
        employeeService.getEmployeeBySalary(60000).forEach(System.out::println);
        System.out.println();

        System.out.println("Employees Emails");
        employeeService.getAllEmployeeEmails().forEach(System.out::println);
        System.out.println();

        System.out.println("Get Employee by Id");
        try {
            System.out.println(employeeService.getEmployeeById(110));
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("No of Employees" + employeeList.size());
        System.out.println("Removed Duplicate Employees");
        employeeService.removeDuplicateEmployeesByID().forEach(System.out::println);
        System.out.println();

        System.out.println("Get First 3 Employees");
        employeeService.getFirst3Employees().forEach(System.out::println);
        System.out.println();

        System.out.println("Skip first 2 Employees print rest of the list");
        employeeService.skip2Employees().forEach(System.out::println);
        System.out.println();

        System.out.println("Peek Logs each employee's information before collecting them into a list");
        employeeService.peekEmployee(50000).forEach(System.out::println);
        System.out.println();

        System.out.println("Count the no of employees in List using Count");
        long employeeCount = employeeService.countEmployees();
        System.out.println("Number of employees: " + employeeCount);
        System.out.println();

        int minSalary = 70000;
        boolean anyMatch = employeeService.anyMatch(minSalary);
        System.out.println("is there any employee with salary greater than " + minSalary + " : "+ anyMatch);
        System.out.println();

        String department = "IT";
        boolean allMatch = employeeService.allMatch();
        System.out.println("all employees are in the " + department + " department : "+ allMatch);
        System.out.println();

        int miniSalary = 20000;
        boolean noneMatch = employeeService.noneMatch(miniSalary);
        System.out.println("No employees have salary less than " + miniSalary + " : " + noneMatch);
        System.out.println();

        System.out.println("First Employee in the List");
        System.out.println(employeeService.firstEmployee());
        System.out.println();

        System.out.println("Any Employee in the List");
        System.out.println(employeeService.anyEmployee());
        System.out.println();
    }
}
