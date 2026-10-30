interface Result {

    void calculateResult();

}

class Student implements Result {

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

    public void calculateResult() {

        int total = mark1 + mark2 + mark3;

        double average = total / 3.0;

        System.out.println("----- Student Result -----");

        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Mark 1  : " + mark1);
        System.out.println("Mark 2  : " + mark2);
        System.out.println("Mark 3  : " + mark3);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);

        if (mark1 >= 35 && mark2 >= 35 && mark3 >= 35) {

            System.out.println("Result  : PASS");

        } else {

            System.out.println("Result  : FAIL");

        }

    }

}

public class StudentResult3 {

    public static void main(String[] args) {

        Student s = new Student("Kowsika", 101, 85, 78, 90);

        s.calculateResult();

    }

}