class StudentResult {

    private final Object marks = new Object();

    private final Object result = new Object();

    void processResult() {

        synchronized (marks) {

            System.out.println("Marks resource locked.");

            synchronized (result) {

                System.out.println("Result resource locked.");

                System.out.println("Student result processed successfully.");

            }

            System.out.println("Result resource released.");

        }

        System.out.println("Marks resource released.");

    }

}

class MarksThread extends Thread {

    StudentResult s;

    MarksThread(StudentResult s) {
        this.s = s;
    }

    public void run() {
        s.processResult();
    }

}

class ResultThread extends Thread {

    StudentResult s;

    ResultThread(StudentResult s) {
        this.s = s;
    }

    public void run() {
        s.processResult();
    }

}

public class StudentResultDeadlock {

    public static void main(String[] args) {

        StudentResult s = new StudentResult();

        MarksThread m = new MarksThread(s);

        ResultThread r = new ResultThread(s);

        m.start();

        r.start();

    }

}