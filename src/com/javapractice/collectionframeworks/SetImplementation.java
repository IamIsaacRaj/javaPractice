package com.javapractice.collectionframeworks;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {
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

        System.out.println("name of the emp1 = " + emp1.getName());

        EmployeeService employeeService = new EmployeeService();

    /*  Set<Employee> employeesHashSet = new HashSet<>();
        employeesHashSet.add(emp1);
        employeesHashSet.add(emp2);
        employeesHashSet.add(emp3);
        employeesHashSet.add(emp4);
        employeesHashSet.add(emp5);
        employeesHashSet.add(emp6);// duplicates are not allowed
        System.out.println("employeesHashSet size = " + employeesHashSet.size());

        for (Employee employee:employeesHashSet){
            employeeService.displayEmployeeDetails(employee);
        }
*/
/*
        Set<Employee> employeesLinkedHashSet = new HashSet<>();
        employeesLinkedHashSet.add(emp1);
        employeesLinkedHashSet.add(emp2);
        employeesLinkedHashSet.add(emp3);
        employeesLinkedHashSet.add(emp4);
        employeesLinkedHashSet.add(emp5);
        employeesLinkedHashSet.add(emp6);// duplicates are not allowed
        System.out.println("employeesLinkedHashSet size = " + employeesLinkedHashSet.size());

        for (Employee employee:employeesLinkedHashSet){
            employeeService.displayEmployeeDetails(employee);
        }
*/
        Set<Employee> employeesTreeSet = new HashSet<>();
        employeesTreeSet.add(emp1);
        employeesTreeSet.add(emp2);
        employeesTreeSet.add(emp3);
        employeesTreeSet.add(emp4);
        employeesTreeSet.add(emp5);
        employeesTreeSet.add(emp6);// duplicates are not allowed

        System.out.println("employeesTreeSet size = " + employeesTreeSet.size());
        System.out.println(employeesTreeSet);

        for (Employee employee:employeesTreeSet){
            employeeService.displayEmployeeDetails(employee);
        }




    }
}
