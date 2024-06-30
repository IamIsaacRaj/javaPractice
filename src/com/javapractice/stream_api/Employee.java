package com.javapractice.stream_api;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    int age;
    String city;
    String department;
    String email;
    String contactNum;
    int salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, String city, String department, String email, String contactNum, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.department = department;
        this.email = email;
        this.contactNum = contactNum;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        return id == employee.id && age == employee.age && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(city, employee.city) && Objects.equals(department, employee.department) && Objects.equals(email, employee.email) && Objects.equals(contactNum, employee.contactNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, city, department, email, contactNum, salary);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", contactNum='" + contactNum + '\'' +
                ", salary=" + salary +
                '}';
    }
}
