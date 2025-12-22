package chapter08_0bject_oriented_programming.aggregation_composition.problem_01_aggregation;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(8888, "Electronics & Telecommunication");

        Student student = new Student(1234, "Sujal Mhetre", department);
        Student student1 = new Student(2345, "Satyam Verma", department);
        Student student2 = new Student(3456, "Aniket Pawar", department);


        student.displayInfo();

        department.displayInfo();
    }
}
