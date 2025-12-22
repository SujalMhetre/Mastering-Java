package chapter08_0bject_oriented_programming.encapsulation.problem01_StudentMarksProtection;

public class Student {
    private String name;
    private int marks;

    Student(String name, int marks) {
        setName(name);
        setMarks(marks);
    }

    String getName() {
        return this.name;
    }

    int getMarks() {
        return this.marks;
    }

    void setName(String name) {
        this.name = name;
    }

    void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Enter valid marks");
        }
    }
}
