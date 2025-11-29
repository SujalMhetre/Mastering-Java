package chapter06_methods_recursion;

import static java.lang.Math.sqrt;

public class PracticeProblems_Methods {
    public static void main(String[] args) {

        // 1) Sum of digits using a method
        int a = 10;
        int b = 20;

        System.out.println("Sum of two number is :" + sum1(a, b));


        // 2) Check prime using a method

        int n1 = 27;

        System.out.println(n1 + " is a prime number " + isprime(n1));

        // 3) Reverse a number with a method

        int n2 = 12345;

        System.out.println("Reverse of the number " + n2 + " is " + reverse(n2));

        // 4)  Method overloading → sum() for: 2 numbers, 3 numbers

        int x = 5;
        int y = 5;
        int z = 5;

        int result1 = sum(x, y);
        System.out.println("sum of two numbers is "+result1);

        int result2 = sum(x, y, z);
        System.out.println("Sum of three numbers is "+result2);

        // 5) Greet Method (Overloading)

        String name = "Sujal";
        int age = 22;

        greet();
        greet(name);
        greet(name, age);


        //  6) Area Calculator (Overloading)
        int side = 4;
        int length = 10;
        int breadth = 20;
        double radius = 5;

        calcArea(side);
        calcArea(length, breadth);
        calcArea(radius);

        // 7) Number Utility Methods
        int n = 17;

        System.out.println(n + " is even " + isEven(n));
        System.out.println(n + " is odd " + isOdd(n));
        System.out.println(n + " is prime " + isprime(n));
        System.out.println(n + " sum of its digits is " + sumOfDigits(n));

        // 8) Palindrome Number Checker
        int num = 454;

        int revResult = reverse(num);

        if (num == revResult) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }

    // 1) Sum of digits using a method
    static int sum1(int a, int b) {
        return a + b;
    }


    // 2) Check prime using a method
    static boolean isprime(int n1) {
        if (n1 <= 1) {
            return false;
        }
        if (n1 == 2) {
            return true;
        }
        if (n1 % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= sqrt(n1); i += 2) {
            if (n1 % i == 0) {
                return false;
            }
        }
        return true;
    }


    // 3) Reverse a number with a method
    static int reverse(int n2) {
        int rev = 0;

        while (n2 != 0) {
            int digit = n2 % 10;
            rev = rev * 10 + digit;
            n2 = n2 / 10;
        }
        return rev;
    }


    // 4)  Method overloading → sum() for: 2 numbers, 3 numbers
    static int sum(int x, int y) {
        return x + y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    // 5) Greet Method (Overloading)
    static void greet() {
        System.out.println("Hello");
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    static void greet(String name, int age) {
        System.out.println("Hello " + name + " Your age is " + age);
    }

    //  6) Area Calculator (Overloading)

    static void calcArea(int side) {
        int area = side * side;
        System.out.println("Area of square is " + area);
    }

    static void calcArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle is " + area);
    }

    static void calcArea(double radius) {
        double area = Math.PI* (radius * radius);
        System.out.println("Area of circle is " + area);
    }

    // 7) Number Utility Methods
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    static int sumOfDigits(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev + n % 10;
            n = n / 10;
        }
        return rev;
    }

    // 8) Palindrome Number Checker

    //  Reused the reverse method and got the solution


}


