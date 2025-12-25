package chapter08_0bject_oriented_programming.aggregation_composition.problem_02_aggregation_stronger;

public class Employee {
    String employeeName;
    int employeeId;
    Address address;

    Employee(String employeeName, int employeeId, Address address) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.address = address;
    }

    void displayInfo() {
        System.out.println("Name :" + this.employeeName);
        System.out.println("Employee-Id :" + this.employeeId);
        System.out.println("Address :");
        address.displayInfo();
    }
}
