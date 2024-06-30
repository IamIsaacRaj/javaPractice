package com.javapractice.stream_api;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService extends Employee{

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees(){
        return this.employeeRepository.getEmployeeList();
    }

    public List<Employee> getEmployeeBySalary(int minSalary) {
        return this.employeeRepository
                .getEmployeeList().stream()
                .filter(employee -> employee.getSalary() >= minSalary)
                .collect(Collectors.toList());
    }

    public List<String> getAllEmployeeEmails(){
        return this.employeeRepository.getEmployeeList().stream()
                                    .map(Employee::getEmail)
                                    .collect(Collectors.toList());
    }

    public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
        Optional<Employee> optional = this.employeeRepository.getEmployeeByID(id);
        if (optional.isPresent())
            return optional.get();
        else
            throw new EmployeeNotFoundException("Employee Not Found with Id : " + id);
    }

    public List<Employee> removeDuplicateEmployeesByID(){
        return this.employeeRepository.getEmployeeList().stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Employee> getFirst3Employees(){
        return this.employeeRepository.getEmployeeList().stream()
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Employee> skip2Employees(){
        return this.employeeRepository.getEmployeeList().stream()
                .skip(2)
                .collect(Collectors.toList());
    }

    public List<Employee> peekEmployee(int minSalary){
        return this.employeeRepository.getEmployeeList().stream()
                .peek(e -> System.out.println("Original: " + e))
                .filter(e -> e.getSalary() > 55000)
                .peek(e -> System.out.println("Filtered: " + e))
                .peek(e -> System.out.println("Increased Salary: " + e))
                .collect(Collectors.toList());
    }

    public long countEmployees(){
        return this.employeeRepository.getEmployeeList().stream().count();
    }

    public boolean anyMatch(int minSalary){
        return this.employeeRepository.getEmployeeList().stream()
                .anyMatch(employee -> employee.getSalary() > minSalary);
    }

    public boolean allMatch(){
        return this.employeeRepository.getEmployeeList().stream()
                .allMatch(employee -> employee.getDepartment().equals("IT"));
    }

    public boolean noneMatch(int minSalary){
        return this.employeeRepository.getEmployeeList().stream()
                .noneMatch(employee -> employee.getSalary() < 20000);
    }

    public Optional<Employee> firstEmployee(){
       return this.employeeRepository.getEmployeeList().stream().findFirst();
    }

    public Optional<Employee> anyEmployee(){
        return this.employeeRepository.getEmployeeList().stream().findAny();
    }

}
