package com.javapractice.collectionframeworks.exercises;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMapMain {
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

        HashMap<Integer,Student> studentHashMap = new HashMap<>();
        studentHashMap.put(Integer.valueOf(s1.getId()), s1);
        studentHashMap.put(Integer.valueOf(s2.getId()), s2);
        studentHashMap.put(Integer.valueOf(s3.getId()), s3);
        studentHashMap.put(Integer.valueOf(s4.getId()), s4);
        studentHashMap.put(Integer.valueOf(s5.getId()), s5);
        studentHashMap.put(Integer.valueOf(s6.getId()), s6);
        studentHashMap.put(Integer.valueOf(s7.getId()), s7);
        studentHashMap.put(Integer.valueOf(s8.getId()), s8);
        studentHashMap.put(Integer.valueOf(s9.getId()), s9);
        studentHashMap.put(Integer.valueOf(s10.getId()), s10);

        StudentService studentService = new StudentService();

//      1.Use a for-each loop to print each student's ID and name in the HashMap
        studentHashMap.forEach((key, value) -> System.out.println(key + ":" + value));

//      2.Replace the name of a student with a specific ID.
        System.out.println("student s5 details before modifying name ");
        studentService.displayStudentDetails(s5);

        studentHashMap.get(5).setName("Rosey");

        System.out.println("student s5 details After modifying name ");
        studentService.displayStudentDetails(s5);

//      3.Remove a student from the HashMap using their ID.
        System.out.println(" No of students before removing  = " + studentHashMap.size());//10
        studentHashMap.remove(6);
        System.out.println(" No of students  After removing = " + studentHashMap.size());//9

//      4.Check if the HashMap contains a specific student ID.
//      Print "Student found" if the ID exists, otherwise print "Student not found".

        int searchId = 12;
        boolean found = false;
        for (Map.Entry<Integer, Student> studentEntry : studentHashMap.entrySet()) {
            if (studentEntry.getKey() == searchId){
                System.out.println("Student with ID " + searchId + " Found");
                System.out.println(studentEntry);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Student with " + searchId + " Not Found");


    }
}
