package chapter08_0bject_oriented_programming.inheritance.problem03_protected_access;

public class Student extends Person {

    public void print() {
        name = "Satyam";
        System.out.println(name);
    }
}
