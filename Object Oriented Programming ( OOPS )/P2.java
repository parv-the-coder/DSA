import java.util.*;

public class P2 {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student("PARVKING");
        Student S3 = new Student(35);
        S1.marks[0] = 99;
        S1.marks[1] = 98;
        S1.marks[2] = 100;

        Student S4 = new Student(S1);
        S4.password = "ABC";
        S1.marks[2] = 88;
        for (int i = 0; i < 3; i++) {
            System.out.println(S4.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Deep copy
    Student(Student S1) {
        marks = new int[3];
        this.name = S1.name;
        this.roll = S1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = S1.marks[i];
        }

    }

    // shallow copy
    // Student(Student S1) {
    // marks = new int[3];
    // this.name = S1.name;
    // this.roll = S1.roll;
    // this.marks = S1.marks;

    // }

    Student() {

        marks = new int[3];
        System.out.println("Constructor is Called.");
    }

    Student(String name) {

        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {

        marks = new int[3];
        this.roll = roll;
    }
}