package chapter08_0bject_oriented_programming.classes_objects;

public class Student {
    int id;
    String name;
    int marks;

    void displayDetails() {
        System.out.println("Students id is " + id);
        System.out.println("Students name is " + name);
        System.out.println("Students marks are :" + marks);
    }
}
