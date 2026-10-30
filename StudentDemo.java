class Student {

    public String name = "Kowsika";

    private int age = 19;

    protected String department = "IT";

    static String college = "KPR Institute of Engineering and Technology";

    static void showCollege() {
        System.out.println("College : " + college);
    }

    // Method Overloading
    void display(String name) {
        System.out.println("Name : " + name);
    }

    void display(int age) {
        System.out.println("Age : " + age);
    }

    void showDepartment() {
        System.out.println("Department : " + department);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s = new Student();

        s.display("Kowsika");

        s.display(19);

        s.showDepartment();

        Student.showCollege();
    }
}