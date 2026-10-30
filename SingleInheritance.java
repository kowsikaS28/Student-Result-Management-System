import java.util.Scanner;

class Student {

    int roll;
    String name;

    void getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    void displayStudentDetails() {

        System.out.println("\nRoll : " + roll);
        System.out.println("Name : " + name);

    }
}

class Result extends Student {

    int total = 0;

    int marks[] = new int[3];

    boolean pass = true;

    void getMarks() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            total += marks[i];

            if (marks[i] < 40) {
                pass = false;
            }
        }
    }

    void displayResult() {

        displayStudentDetails();

        System.out.println("Total : " + total + "/300");

        System.out.println("Pass : " + pass);

    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Result r = new Result();

        r.getStudentDetails();

        r.getMarks();

        r.displayResult();

    }
}