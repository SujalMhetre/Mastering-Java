package chapter01_variables;

public class TypeCasting {
    static void main(String[] args) {
        int a = 10;
        double b = a;     // widening (automatic)

        double x = 12.9;
        int y = (int) x;  // narrowing (manual)

        System.out.println("Widening: " + b);
        System.out.println("Narrowing: " + y);
    }
}
