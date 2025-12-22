package chapter08_0bject_oriented_programming.encapsulation.problem04_ImmutableStudentID;

public class Student {
    private final int studentID;
    private String name;
    private int marks;

    public Student(int studentID, String name, int marks) {
        this.studentID = studentID;
        setName(name);
        setMarks(marks);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Enter valid marks");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getMarks() {
        return this.marks;
    }

    public int getStudentID() {
        return this.studentID;
    }

}
