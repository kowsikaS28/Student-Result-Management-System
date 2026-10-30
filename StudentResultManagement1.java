import java.util.Scanner;

abstract class Student {

    int regNo;
    String name;

    void getStudentDetails(Scanner sc) {

        System.out.print("Enter Register Number: ");
        regNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
    }

    abstract void getMarks(Scanner sc);

    abstract void calculateResult();

    abstract void displayResult();
}

class Result extends Student {

    int m1, m2, m3, total;
    double average;
    String grade;

    @Override
    void getMarks(Scanner sc) {

        System.out.print("Enter Mark 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        m3 = sc.nextInt();
    }

    @Override
    void calculateResult() {

        total = m1 + m2 + m3;

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

    @Override
    void displayResult() {

        System.out.println("\n----- Student Result -----");

        System.out.println("Register Number : " + regNo);

        System.out.println("Student Name : " + name);

        System.out.println("Mark 1 : " + m1);

        System.out.println("Mark 2 : " + m2);

        System.out.println("Mark 3 : " + m3);

        System.out.println("Total : " + total);

        System.out.printf("Average : %.2f\n", average);

        System.out.println("Grade : " + grade);
    }
}

public class StudentResultManagement1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        r.getStudentDetails(sc);

        r.getMarks(sc);

        r.calculateResult();

        r.displayResult();

        sc.close();
    }
}