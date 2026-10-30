import java.util.Scanner;

interface StudentDetails {

    void displayDetails();

}

interface Result {

    void calculateResult();

}

class Student implements StudentDetails, Result {

    String name;
    int rollNo, m1, m2, m3;

    Student(String name, int rollNo, int m1, int m2, int m3) {

        this.name = name;
        this.rollNo = rollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;

    }

    public void displayDetails() {

        System.out.println("\n--- STUDENT DETAILS ---");

        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);

    }

    public void calculateResult() {

        int total = m1 + m2 + m3;

        double average = total / 3.0;

        String grade;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("Mark 1  : " + m1);
        System.out.println("Mark 2  : " + m2);
        System.out.println("Mark 3  : " + m3);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);

    }

}

public class StudentResultManagement3 {

    static void showResult(Student s) {

        s.displayDetails();
        s.calculateResult();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        Student s = new Student(name, rollNo, m1, m2, m3);

        showResult(s);

        sc.close();

    }

}