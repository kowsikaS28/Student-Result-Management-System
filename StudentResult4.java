package Student;
import java.util.Scanner;
public class StudentResult4 {
    void calculateResult(int mark1, int mark2, int mark3) {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        System.out.println("\n--- Student Result ---");
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        if (average >= 50)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentResult s = new StudentResult();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter mark 1: ");
        int mark1 = sc.nextInt();
        System.out.print("Enter mark 2: ");
        int mark2 = sc.nextInt();
        System.out.print("Enter mark 3: ");
        int mark3 = sc.nextInt();

        System.out.println("Student Name: " + name);
        s.calculateResult(mark1, mark2, mark3);
    }
}