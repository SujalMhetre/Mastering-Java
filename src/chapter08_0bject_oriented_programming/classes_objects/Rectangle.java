package chapter08_0bject_oriented_programming.classes_objects;

public class Rectangle {
    int length;
    int breadth;

    void areaOfRectangel(int length, int breadth) {
        int area = 0;
        area = length * breadth;
        System.out.println("Area of rectangel is :" + area);
    }
}
