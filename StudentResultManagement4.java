class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }

}

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayResult() throws InvalidMarksException {

        if (marks < 0 || marks > 100) {

            throw new InvalidMarksException(
                "Invalid marks! Marks must be between 0 and 100."
            );

        }

        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);

        if (marks >= 40) {
            System.out.println("Result       : PASS");
        } else {
            System.out.println("Result       : FAIL");
        }

    }

}

public class StudentResultManagement4 {

    public static void main(String[] args) {

        try {

            Student s1 = new Student("Kowsika", 85);

            s1.displayResult();

        } catch (InvalidMarksException e) {

            System.out.println("Exception: " + e.getMessage());

        }

    }

}