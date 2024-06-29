package com.javapractice.collectionframeworks.exercises;

public class Student {
    private String id;
    private String name;
    private int age;

    private String className;
    private double grade;

    public Student(String id, String name, int age, String className, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.className = className;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                ", grade=" + grade +
                '}';
    }
}
