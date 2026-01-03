package chapter15_generics.problem_01;

public class BoxDemo {
    public static void main(String[] args) {

        Box<String> products = new Box<>();

        products.setItem("Iphone");

        System.out.println(products.getItem());

        Box<Integer> price = new Box<>();

        price.setItem(999);
        System.out.println(price.getItem());
    }
}
