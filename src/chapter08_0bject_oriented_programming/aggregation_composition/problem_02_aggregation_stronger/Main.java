package chapter08_0bject_oriented_programming.aggregation_composition.problem_02_aggregation_level1;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Pune", "Maharashtra", 411041);

        Employee employee1 = new Employee("Sujal Mhetre", 1234, address);
        Employee employee2 = new Employee("Satyam Verma", 2345, address);
        Employee employee3 = new Employee("Aniket Pawar", 3456, address);

        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();

        address.displayInfo();
    }
}
