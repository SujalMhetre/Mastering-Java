package chapter11_exception_handling.problem_05_throws_keyword;

public class ThrowsDemo {
    static void divide(int num1, int num2)throws ArithmeticException {
        int div = num1 / num2;
        System.out.println(div);
    }

    public static void main(String[] args) {

        try {
            divide(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

}
