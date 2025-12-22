package chapter08_0bject_oriented_programming.aggregation_composition.problem_01_aggregation;

public class Student {
    int studentId;
    String studentName;
    Department department;

    Student(int studentId, String studentName, Department department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
    }

    void displayInfo() {
        System.out.println("Student Name :" + this.studentName);
        System.out.println("Student-Id :" + this.studentId);
        System.out.println("Department :" + department.departmentName);
    }
}
