package chapter08_0bject_oriented_programming.constructors;

public class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Id     :" + this.id);
        System.out.println("Name   :" + this.name);
        System.out.println("Salary :" + this.salary);
    }

}
