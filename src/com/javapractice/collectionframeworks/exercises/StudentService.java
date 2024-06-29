package com.javapractice.collectionframeworks.exercises;

public class StudentService {
    public void displayStudentDetails(Student student){
        System.out.println("id = " + student.getId());
        System.out.println("name = " + student.getName());
        System.out.println("age = " + student.getAge());
        System.out.println("className = " +student.getClassName());
        System.out.println("grade = " + student.getGrade());
        System.out.println("----------------------------");
    }
}
