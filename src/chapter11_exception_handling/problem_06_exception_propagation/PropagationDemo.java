package chapter11_exception_handling.problem_06_exception_propagation;

public class PropagationDemo {
    static void methodC(int num1, int num2) throws ArithmeticException {
        System.out.println(num1 / num2);
    }

    static void methodB() {
        methodC(10, 0);
    }

    static void methodA() {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        methodA();
    }
}
