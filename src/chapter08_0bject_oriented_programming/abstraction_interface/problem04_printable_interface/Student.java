package chapter08_0bject_oriented_programming.abstraction_interface.problem04_printable_interface;

public class Student implements Printable {

    String name;
    int rollNo;
    String course;

    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    public void print() {
        System.out.println("Name :" + name);
        System.out.println("Roll-no :" + rollNo);
        System.out.println("Course :" + course);
    }
}
