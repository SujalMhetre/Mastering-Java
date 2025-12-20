package chapter08_0bject_oriented_programming.polymorphism.problem02_employee_work_schedule;

public class Manager extends Employee {
    Manager(String name, double employeeID,double salary) {
        super(name, employeeID,salary);
    }

    @Override
    void work() {
        System.out.println("Manager task");
    }
}
