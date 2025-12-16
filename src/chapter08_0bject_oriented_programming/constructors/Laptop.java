package chapter08_0bject_oriented_programming.constructors;

public class Laptop {
    String brand;
    int ram;

    Laptop(){
        brand = "unknown";
        ram = 8;
        System.out.println("Laptop object created");
    }

    void displayDetails(){
        System.out.println("Brand :"+brand);
        System.out.println("Ram   :"+ram);
    }

}
