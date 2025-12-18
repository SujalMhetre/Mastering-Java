package chapter08_0bject_oriented_programming.inheritance.problem07_employee_system;

public class Employee {

    protected String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void getDetails() {
        System.out.println(this.name + " " + this.salary);
    }
}
