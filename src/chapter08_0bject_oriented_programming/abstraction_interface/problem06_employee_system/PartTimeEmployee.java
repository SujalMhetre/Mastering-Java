package chapter08_0bject_oriented_programming.abstraction_interface.problem06_employee_system;

public class PartTimeEmployee extends Employee implements Taxable {
    PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 5 / 100;
    }

    @Override
    public double calculateTax() {
        return salary * 10 / 100;
    }
}
