class Result {

    int marks;
    boolean ready = false;

    synchronized void setMarks(int marks) {

        this.marks = marks;
        ready = true;

        System.out.println("Marks entered: " + marks);

        notify();

    }

    synchronized void getMarks() {

        while (!ready) {

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }

        System.out.println("Marks received: " + marks);

        if (marks >= 50)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");

    }

}

class Teacher extends Thread {

    Result r;

    Teacher(Result r) {
        this.r = r;
    }

    public void run() {
        r.setMarks(75);
    }

}

class Student extends Thread {

    Result r;

    Student(Result r) {
        this.r = r;
    }

    public void run() {
        r.getMarks();
    }

}

public class StudentManagement {

    public static void main(String[] args) {

        Result r = new Result();

        Student s = new Student(r);

        Teacher t = new Teacher(r);

        s.start();

        t.start();

    }

}