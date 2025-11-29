package chapter06_methods_recursion;

public class PracticeProblem_Recursion {
    public static void main(String[] args) {
        int n = 10;
        int m = 12345;
        // 1) Print Numbers from 1 to N (Increasing)
        System.out.printf("1 - %d is: \n", n);
        printIncreasing(n);

        // 2) Print Numbers from N to 1 (Decreasing)
        System.out.println();
        System.out.printf("%d - 1 is: \n", n);
        printDecreasing(n);

        // 3) Sum of First N Numbers
        System.out.println();
        System.out.println("Sum of the number is ");
        System.out.println(sum(n));

        // 4) Factorial of N
        System.out.printf("Factorial of %d \n", facto(n));

        // 5) Power of a number: xⁿ
        System.out.println("Power of " + n + " to x is :");
        System.out.println(power(2, n));

        // 6) Sum of Digits
        System.out.println("Sum of the digits :");
        System.out.println(sumDigits(m));

        // 7) Product of Digits
        System.out.println("Product of the digits :");
        System.out.println(prodDigits(m));

        // 8
        System.out.println(countDigits(m));
    }

    // 1) Print Numbers from 1 to N (Increasing)
    static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    // 2) Print Numbers from N to 1 (Decreasing)
    static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    // 3) Sum of First N Numbers
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    // 4) Factorial of N
    static int facto(int n) {
        if (n == 1) {
            return 1;
        }
        return n * facto(n - 1);
    }

    // 5) Power of a number: xⁿ
    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    // 6) Sum of Digits Using Recursion
    static int sumDigits(int m) {

        if (m == 0) {
            return 0;
        }
        int digits = m % 10;
        int rest = m / 10;

        return digits + sumDigits(rest);
    }

    // 7) Product of Digits Using Recursion
    static int prodDigits(int m) {
        if (m == 0) {
            return 1;
        }
        int digits = m % 10;
        int rest = m / 10;

        return digits * prodDigits(rest);
    }

    // 8) Count Digits of a Number
    static int countDigits(int m) {
        if (m == 0) {
            return 0;
        }
        return 1 + countDigits(m / 10);

    }
}