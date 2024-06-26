package com.javapractice.encapsulation.exercises;

public class StudentTest {
    public static void main(String[] args) {
        Student student;
        student = new Student();

        student.displayStudentInfo();

        student.setId(111);
        student.setName("Jaya");
        student.setAge((byte) 19);
        student.setCourse("ECE");
        student.setGrade(8.65);

        student.displayStudentInfo();

        Student student1;
        student1 = new Student(222,"Krish",(byte) 20,"MECH",9.2);

        student1.displayStudentInfo();
        // modifying grade
        student1.setGrade(7.9);
        student1.displayStudentInfo();

    }
}
