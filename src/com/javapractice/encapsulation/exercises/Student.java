package com.javapractice.encapsulation.exercises;

public class Student {
    int id;
    String name;
    byte age;
    String course;
    double grade;

    public Student() {
    }

    public Student(int id, String name, byte age, String course, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
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

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void displayStudentInfo(){
        System.out.println("id = " + getId());
        System.out.println("name = " + getName());
        System.out.println("age = " + getAge());
        System.out.println("course = " + getCourse());
        System.out.println("grade = " + getGrade());
        System.out.println("-------------------------");
    }
}
