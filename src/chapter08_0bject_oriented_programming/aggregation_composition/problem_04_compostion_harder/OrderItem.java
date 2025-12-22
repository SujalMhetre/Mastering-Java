package chapter08_0bject_oriented_programming.aggregation_composition.problem_04_compostion_harder;

public class OrderItem {
    private String itemName;
    private int price;
    private int quantity;

    OrderItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    int getTotalprice() {
        return price * quantity;
    }

    void showDetails() {
        System.out.println("Item name:" + this.itemName);
        System.out.println("Price :" + this.price);
        System.out.println("Quantity :" + this.quantity);
    }


}
