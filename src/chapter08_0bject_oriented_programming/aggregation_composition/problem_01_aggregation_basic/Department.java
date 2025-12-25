package chapter08_0bject_oriented_programming.aggregation_composition.problem_01_aggregation_basic;

public class Department {
    int departmentID;
    String departmentName;


    Department(int departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }

    void displayInfo() {
        System.out.println("Department Name:" + this.departmentName);
        System.out.println("Department-Id:" + this.departmentID);
    }


}
