package chapter08_0bject_oriented_programming.polymorphism.problem02_employee_work_schedule;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {new Manager("Sujal", 12345, 80000),
                new Developer("Satyam", 4321, 50000),
                new Tester("Gayatri", 5642, 30000)};

        for (Employee employee : employees) {
            employee.work();
            employee.calculateSalary();
        }
    }

}
