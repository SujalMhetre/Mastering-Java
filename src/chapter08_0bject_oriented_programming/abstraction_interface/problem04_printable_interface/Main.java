package chapter08_0bject_oriented_programming.abstraction_interface.problem04_printable_interface;

public class Main {
    public static void main(String[] args) {
        Printable student = new Student("Sujal", 1234, "BE");
        Printable invoice = new Invoice(4321, "Satyam", 5000);

        Printable[] items = {student, invoice};

        for (Printable item : items) {
            item.print();
        }

    }
}
