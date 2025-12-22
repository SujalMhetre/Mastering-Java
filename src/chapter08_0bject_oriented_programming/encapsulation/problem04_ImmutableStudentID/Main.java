package chapter08_0bject_oriented_programming.encapsulation.problem04_ImmutableStudentID;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1234,"Sujal Mhetre",85);

        System.out.println(student1.getStudentID());
        System.out.println(student1.getName());
        System.out.println(student1.getMarks());

        student1.setName("Satyam");
        student1.setMarks(-55);

    }
}
