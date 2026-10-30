class Student {

    String name;
    int mark1, mark2, mark3;
    int total;
    double average;
    char grade;

    // Constructor
    Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void calculateResult() {
        total = mark1 + mark2 + mark3;
        average = total / 3.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 50)
            grade = 'C';
        else
            grade = 'F';
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);
    }

    public static void main(String[] args) {

        // Object creation
        Student s = new Student("Kowsika", 85, 90, 80);

        s.calculateResult();
        s.display();
    }
}