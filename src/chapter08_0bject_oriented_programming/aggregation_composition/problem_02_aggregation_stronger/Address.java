package chapter08_0bject_oriented_programming.aggregation_composition.problem_02_aggregation_level1;

public class Address {
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    void displayInfo() {
        System.out.println("State :" + this.state);
        System.out.println("City :" + this.city);
        System.out.println("Pincode :" + this.pincode);
    }

}
