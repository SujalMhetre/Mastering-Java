package chapter08_0bject_oriented_programming.aggregation_composition.problem_04_compostion_harder;

public class Order {
    private int orderId;
    private String customerName;
    private OrderItem[] items;
    private int itemCount;


    Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = new OrderItem[5];
        this.itemCount = 0;
    }

    void additem(String itemname, int price, int quantity) {
        items[itemCount] = new OrderItem(itemname, price, quantity);
        itemCount++;
    }

    void orderDetails() {
        System.out.println("Customer Name :" + this.customerName);
        System.out.println("Customer-Id :" + this.orderId);
        System.out.println("Order details :");

        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            items[i].showDetails();
            total += items[i].getTotalprice();
        }

        System.out.println("Total bill :" + total);
    }


}
