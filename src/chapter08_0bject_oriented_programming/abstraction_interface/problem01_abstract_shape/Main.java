package chapter08_0bject_oriented_programming.abstraction_interface.problem01_abstract_shape;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("*********CIRCLE**************");
        System.out.println("Area of Circle :" + circle.area());
        System.out.println("Perimeter of Circle :" + circle.perimeter());

        System.out.println("*********RECTANGLE**************");
        System.out.println("Area of rectangle :" + rectangle.area());
        System.out.println("Perimeter of rectangle :" + rectangle.perimeter());
    }
}
