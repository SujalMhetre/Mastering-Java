package chapter08_0bject_oriented_programming.polymorphism.problem02_employee_work_schedule;

public class Tester extends Employee {
    Tester(String name, double employeeID,double salary) {
        super(name, employeeID,salary);
    }

    @Override
    void work() {
        System.out.println("Tester task");
    }
}
