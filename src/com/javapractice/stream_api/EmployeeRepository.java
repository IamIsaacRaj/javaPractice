package com.javapractice.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository {
    private List<Employee> employeeList;

    public EmployeeRepository(){
        this.employeeList = new ArrayList<>();
        employeeList.add( new Employee(101, "Alice Johnson", 30, "New York", "Marketing", "alice.johnson@example.com", "555-1234", 60000));
        employeeList.add( new Employee(102, "Bob Smith", 35, "Los Angeles", "Sales", "bob.smith@example.com", "555-5678", 50000));
        employeeList.add( new Employee(103, "Carol Williams", 28, "Chicago", "HR", "carol.williams@example.com", "555-8765", 58000));
        employeeList.add( new Employee(104, "David Brown", 40, "Houston", "IT", "david.brown@example.com", "555-4321", 75000));
        employeeList.add( new Employee(105, "Emma Davis", 32, "Phoenix", "Finance", "emma.davis@example.com", "555-6543", 67000));
        employeeList.add( new Employee(106, "Frank Wilson", 28, "Chicago", "HR", "frank.wilson@example.com", "555-0987", 58000));
        employeeList.add( new Employee(107, "Grace Lee", 35, "Los Angeles", "Sales", "grace.lee@example.com", "555-2109", 55000));
        employeeList.add( new Employee(108, "Henry Martin", 30, "New York", "Marketing", "henry.martin@example.com", "555-3344", 60000));
        employeeList.add( new Employee(109, "Isabella Garcia", 28, "Chicago", "HR", "isabella.garcia@example.com", "555-7788", 58000));
        employeeList.add( new Employee(110, "Jack Miller", 35, "Los Angeles", "Sales", "jack.miller@example.com", "555-9988", 55000));
        employeeList.add( new Employee(103, "Carol Williams", 28, "Chicago", "HR", "carol.williams@example.com", "555-8765", 58000));
        employeeList.add( new Employee(107, "Grace Lee", 35, "Los Angeles", "Sales", "grace.lee@example.com", "555-2109", 55000));
    }

    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public Optional<Employee> getEmployeeByID(int id) {
        return this.employeeList.stream().filter(employee -> employee.getId() == id).findFirst();
    }
}
