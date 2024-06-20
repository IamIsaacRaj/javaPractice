package javaPractice.oop;

public class StudentMain {

    public static void main(String[] args) {

        Student student;
        student = new Student();

        student.id = 11;
        student.name = "Joe";
        student.age = 21;
        student.course = "Computer Science";
        student.grade = 9.0;

        System.out.println("student Id = " + student.id);
        System.out.println("student Name = " + student.name);
        System.out.println("student Age = " + student.age);
        System.out.println("student Course = " + student.course);
        System.out.println("student Grade = " + student.grade);

        Student student1;
        student1 = new Student();

        student1.id = 22;
        student1.name = "Ajay";
        student1.age = 19;
        student1.course = "Civil Engineering";
        student1.grade = 8.2;

        System.out.println("student1 Id = " + student1.id);
        System.out.println("student1 Name = " + student1.name);
        System.out.println("student1 Age = " + student1.age);
        System.out.println("student1 Course = " + student1.course);
        System.out.println("student1 Grade = " + student1.grade);

    }
}
