package chapter08_0bject_oriented_programming.constructors;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Harrypotter");

        Book book2 = new Book("Harrypotter", "J. K. Rowling");

        Book book3 = new Book("Harrypotter", "J. K. Rowling", 10000);

        System.out.println("*******BOOK1*********");
        book1.displayDetails();
        System.out.println("*******BOOK2*********");
        book2.displayDetails();
        System.out.println("*******BOOK3*********");
        book3.displayDetails();
    }
}
