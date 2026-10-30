import java.util.Scanner;

class Student {

    int rollNo;
    String name;

    void getStudentDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

    }

}

class Result extends Student {

    int mark1, mark2, mark3;
    int total;
    double average;
    String grade;

    void getMarks() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        mark3 = sc.nextInt();

    }

    void calculateResult() {

        total = mark1 + mark2 + mark3;

        average = total / 3.0;

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
            grade = "Fail";

    }

    void displayResult() {

        System.out.println("\n----- STUDENT RESULT -----");

        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Mark 1      : " + mark1);
        System.out.println("Mark 2      : " + mark2);
        System.out.println("Mark 3      : " + mark3);
        System.out.println("Total       : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Grade       : " + grade);

    }

}

public class StudentResult2 {

    public static void main(String[] args) {

        Result r = new Result();

        r.getStudentDetails();

        r.getMarks();

        r.calculateResult();

        r.displayResult();

    }

}