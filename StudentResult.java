import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Register Number: ");
        int regNo = sc.nextInt();

        System.out.print("Enter Mark 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int mark3 = sc.nextInt();

        // Calculation
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        // Grade Calculation
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Output
        System.out.println("\n----- Student Result -----");

        System.out.println("Name            : " + name);
        System.out.println("Register Number : " + regNo);
        System.out.println("Total Marks     : " + total);
        System.out.println("Average         : " + average);
        System.out.println("Grade           : " + grade);

        sc.close();
    }
}