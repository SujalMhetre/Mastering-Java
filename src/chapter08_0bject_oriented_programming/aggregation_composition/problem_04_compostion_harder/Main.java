package chapter08_0bject_oriented_programming.aggregation_composition.problem_04_compostion_harder;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(1234, "Sujal Mhetre");

        order1.additem("Iphone-17", 140000, 1);
        order1.additem("Blazzer", 5000, 1);
        order1.additem("Tshirts", 1500, 5);

        order1.orderDetails();

    }
}
