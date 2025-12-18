package chapter08_0bject_oriented_programming.inheritance.problem07_employee_system;

public class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Manager bonus applied");
    }
}
