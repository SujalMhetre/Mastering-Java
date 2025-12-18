package chapter08_0bject_oriented_programming.inheritance.problem07_employee_system;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Sujal", 50000);

        Manager manager = new Manager("Sujal", 80000);

        employee.getDetails();

        manager.getDetails();
    }
}
