package chapter08_0bject_oriented_programming.polymorphism.problem02_employee_work_schedule;

public abstract class Employee {

    String name;
    double employeeID;
    double salary;

    Employee(String name, double employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    abstract void work();

    void calculateSalary() {
        System.out.println(this.salary);
    }
}
