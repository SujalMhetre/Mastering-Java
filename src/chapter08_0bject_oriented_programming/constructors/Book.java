package chapter08_0bject_oriented_programming.constructors;

public class Book {
    String title;
    String authour;
    double price;

    Book(String title) {
        this.title = title;
        this.authour = "Unknown";
        this.price = 0;
    }

    Book(String title, String authour) {
        this.title = title;
        this.authour = authour;
        this.price = 0;
    }

    Book(String title, String authour, double price) {
        this.title = title;
        this.authour = authour;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title   :" + title);
        System.out.println("Authour :" + authour);
        System.out.println("Price   :" + price);
    }
}
