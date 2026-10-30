import java.util.Scanner;

abstract class Student {

    String name;
    int rollNo;
    int mark1, mark2, mark3;

    Student(String name, int rollNo, int mark1, int mark2, int mark3) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    abstract void calculateResult();

    void displayDetails() {

        System.out.println("\n========== STUDENT DETAILS ==========");

        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Mark 1       : " + mark1);
        System.out.println("Mark 2       : " + mark2);
        System.out.println("Mark 3       : " + mark3);
    }
}

class StudentResult extends Student {

    StudentResult(String name, int rollNo,
                  int mark1, int mark2, int mark3) {

        super(name, rollNo, mark1, mark2, mark3);
    }

    // Overriding abstract method
    @Override
    void calculateResult() {

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        String grade;
        String result;

        if (mark1 < 40 || mark2 < 40 || mark3 < 40) {
            grade = "F";
            result = "FAIL";
        }
        else if (average >= 90) {
            grade = "A+";
            result = "PASS";
        }
        else if (average >= 80) {
            grade = "A";
            result = "PASS";
        }
        else if (average >= 70) {
            grade = "B";
            result = "PASS";
        }
        else if (average >= 60) {
            grade = "C";
            result = "PASS";
        }
        else if (average >= 50) {
            grade = "D";
            result = "PASS";
        }
        else {
            grade = "F";
            result = "FAIL";
        }

        displayDetails();

        System.out.println("=====================================");
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + result);
        System.out.println("=====================================");
    }
}

public class StudentResultManagement2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT RESULT MANAGEMENT =====");

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number  : ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Mark 1       : ");
        int mark1 = sc.nextInt();

        System.out.print("Enter Mark 2       : ");
        int mark2 = sc.nextInt();

        System.out.print("Enter Mark 3       : ");
        int mark3 = sc.nextInt();

        Student student = new StudentResult(
                name, rollNo, mark1, mark2, mark3);

        // Runtime polymorphism
        student.calculateResult();

        sc.close();
    }
}