package chapter08_0bject_oriented_programming.constructors;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1234, "Sujal", 50000);

        Employee employee2 = new Employee(4321, "Satyam", 40000);

        System.out.println("**********************");
        employee1.displayEmployee();

        System.out.println("**********************");
        employee2.displayEmployee();
    }
}
