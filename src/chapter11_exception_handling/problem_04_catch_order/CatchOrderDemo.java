package chapter11_exception_handling.problem_04_catch_order;

public class CatchOrderDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


        // what happens if Exception is caught before ArithmeticException?
        // If Exception is caught first, the compiler throws an error because ArithmeticException becomes unreachable code

    }
}
