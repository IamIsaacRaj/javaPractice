package com.javapractice.collectionframeworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListImplementation {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setId(101);
        emp1.setName("Alice Johnson");
        emp1.setDepartment("Marketing");
        emp1.setEmail("alice.johnson@example.com");
        emp1.setContactNum("555-1234");
        emp1.setSalary(60000);
        Employee emp2 = new Employee();
        emp2.setId(102);
        emp2.setName("Bob Smith");
        emp2.setDepartment("Sales");
        emp2.setEmail("bob.smith@example.com");
        emp2.setContactNum("555-5678");
        emp2.setSalary(55000);
        Employee emp3 = new Employee();
        emp3.setId(103);
        emp3.setName("Carol Williams");
        emp3.setDepartment("HR");
        emp3.setEmail("carol.williams@example.com");
        emp3.setContactNum("555-8765");
        emp3.setSalary(58000);
        Employee emp4 = new Employee();
        emp4.setId(104);
        emp4.setName("David Brown");
        emp4.setDepartment("IT");
        emp4.setEmail("david.brown@example.com");
        emp4.setContactNum("555-4321");
        emp4.setSalary(75000);
        Employee emp5 = new Employee();
        emp5.setId(105);
        emp5.setName("Emma Davis");
        emp5.setDepartment("Finance");
        emp5.setEmail("emma.davis@example.com");
        emp5.setContactNum("555-6543");
        emp5.setSalary(67000);
        Employee emp6 = new Employee();
        emp6.setId(104);
        emp6.setName("David Brown");
        emp6.setDepartment("IT");
        emp6.setEmail("david.brown@example.com");
        emp6.setContactNum("555-4321");
        emp6.setSalary(75000);

        LinkedList<Employee> employeeLinkedList = new LinkedList<>();

        employeeLinkedList.add(emp1);
        employeeLinkedList.add(emp2);
        employeeLinkedList.add(emp3);
        employeeLinkedList.add(emp4);
        employeeLinkedList.add(emp6);//allows duplicates
        employeeLinkedList.add(emp5);

        System.out.println("employeeLinkedList size = " + employeeLinkedList.size()); // 5
        System.out.println(employeeLinkedList);
        
        Employee employee1 = employeeLinkedList.get(0);
        System.out.println("employee1 = " + employee1);
        
        EmployeeService employeeService = new EmployeeService();

        for (Employee employee : employeeLinkedList){
//            System.out.println(employee);
            employeeService.displayEmployeeDetails(employee);
        }

        List<Employee> employeeArrayList = new ArrayList<>();

        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);
        employeeArrayList.add(emp3);
        employeeArrayList.add(emp4);
        employeeArrayList.add(emp5);
        employeeArrayList.add(emp6);// allows duplicates

        System.out.println("employeeArrayList size = " + employeeArrayList.size());//6
        System.out.println(employeeArrayList);

        Employee employees = employeeArrayList.get(0);
        System.out.println("employee1 = " + employees);

        for (Employee employee : employeeArrayList){
//            System.out.println(employee);
            employeeService.displayEmployeeDetails(employee);
        }

    }
}
