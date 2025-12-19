package chapter08_0bject_oriented_programming.abstraction_interface.problem04_printable_interface;

public class Invoice implements Printable {

    int invoiceNumber;
    String customerName;
    double amount;

    Invoice(int invoiceNumber, String customerName, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void print() {
        System.out.println("Invoice-NO :" + invoiceNumber);
        System.out.println("Customer-Name :" + customerName);
        System.out.println("Amount :" + amount);
    }
}
