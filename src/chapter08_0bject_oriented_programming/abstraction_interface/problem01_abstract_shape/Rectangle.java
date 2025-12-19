package chapter08_0bject_oriented_programming.abstraction_interface.problem01_abstract_shape;

public class Rectangle extends Shape{
    double width;
    double length;

    Rectangle(  double width,double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double area(){
        return length * width;
    }

    @Override
    public double perimeter(){
        return 2 *(length + width);
    }
}

