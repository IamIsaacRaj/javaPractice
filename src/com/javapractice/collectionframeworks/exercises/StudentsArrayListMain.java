package com.javapractice.collectionframeworks.exercises;

import java.util.ArrayList;
import java.util.List;

public class StudentsArrayListMain {
    public static void main(String[] args) {

        Student s1 = new Student("1", "Alice", 14, "8A", 88.5);
        Student s2 = new Student("2", "Bob", 13, "7B", 76.3);
        Student s3 = new Student("3", "Charlie", 15, "9A", 91.2);
        Student s4 = new Student("4", "David", 14, "8B", 85.0);
        Student s5 = new Student("5", "Eve", 13, "7A", 78.6);
        Student s6 = new Student("6", "Frank", 15, "9B", 69.4);
        Student s7 = new Student("7", "Grace", 14, "8C", 89.9);
        Student s8 = new Student("8", "Hank", 13, "7C", 72.1);
        Student s9 = new Student("9", "Ivy", 15, "9C", 80.5);
        Student s10 = new Student("10", "Jack", 14, "8D", 94.3);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);
        studentsList.add(s5);
        studentsList.add(s6);
        studentsList.add(s7);
        studentsList.add(s8);
        studentsList.add(s9);
        studentsList.add(s10);

        StudentService studentService = new StudentService();

//      to print students from studentArray using for loop and display method
        for (Student student : studentsList) {
            studentService.displayStudentDetails(student);
        };
//      to print students array using toString method
        System.out.println(studentsList);
        System.out.println();

//      Modifying ArrayList;
        System.out.println(" Before Modified age of s2 = " + studentsList.get(1));

//      Replace the element at index 2 with a new value.
        s2.setAge(8);
        studentsList.get(1).setClassName("5B");
        System.out.println("Modified age of s2 = " + s2.toString());
        System.out.println();
        
//      remove the student from student list
        studentsList.remove(4);//remove s5 at index 4
        System.out.println("studentsList.size() = " + studentsList.size());

        for (Student student : studentsList) {
            studentService.displayStudentDetails(student);
        };

//       Check if the ArrayList contains a specific student name.

        String searchName = "bob";
        boolean found = false;
        for (Student student : studentsList) {
            if (student.getName().equalsIgnoreCase(searchName)){
                System.out.println("Student Found");
                System.out.println(student);
                found = true;
                break;
            }
        };
        if (!found){
            System.out.println("Student with name '" + searchName + "' not found.");
        }
    }
}
