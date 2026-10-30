import java.util.Scanner;

class Student {

    int regNo;
    String name;

    void getStudent(Scanner sc) {

        System.out.print("Enter Register Number: ");
        regNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
    }

    void displayStudent() {

        System.out.println("Register Number : " + regNo);
        System.out.println("Student Name : " + name);
    }
}

class Marks extends Student {

    int m1, m2, m3, total;

    void getMarks(Scanner sc) {

        System.out.print("Enter Mark 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        m3 = sc.nextInt();

        total = m1 + m2 + m3;
    }

    void displayMarks() {

        System.out.println("Mark 1 : " + m1);
        System.out.println("Mark 2 : " + m2);
        System.out.println("Mark 3 : " + m3);
        System.out.println("Total : " + total);
    }
}

class Result extends Student {

    void showResult(int total) {

        double average = total / 3.0;

        System.out.println("Average : " + average);

        if (average >= 50)
            System.out.println("Result : PASS");
        else
            System.out.println("Result : FAIL");
    }
}

public class StudentResultManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\n===== Student " + i + " =====");

            Marks m = new Marks();

            m.getStudent(sc);
            m.getMarks(sc);

            Result r = new Result();

            r.regNo = m.regNo;
            r.name = m.name;

            System.out.println("\n----- Student Details -----");
            r.displayStudent();

            System.out.println("\n----- Marks -----");
            m.displayMarks();

            System.out.println("\n----- Result -----");
            r.showResult(m.total);

        }

        sc.close();
    }
}