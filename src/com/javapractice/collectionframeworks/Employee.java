package com.javapractice.collectionframeworks;

import java.util.Objects;
import java.io.Serializable;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    String department;
    String email;
    String contactNum;
    int salary;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(department, employee.department) && Objects.equals(email, employee.email) && Objects.equals(contactNum, employee.contactNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, email, contactNum, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", contactNum='" + contactNum + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Employee o){
        return name.compareTo(o.getName());
    }
}
