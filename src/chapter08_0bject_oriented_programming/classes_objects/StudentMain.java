package chapter08_0bject_oriented_programming.classes_objects;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Sujal";
        student1.id = 1234;
        student1.marks = 85;

        Student student2 = new Student();

        student2.name = "Satyam";
        student2.id = 4321;
        student2.marks = 70;

        System.out.println("************************************");
        student1.displayDetails();

        System.out.println("************************************");

        student2.displayDetails();
        System.out.println("************************************");

    }
}
