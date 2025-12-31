package chapter07_arrays;

public class PracticeProblems_Varags {
    public static void main(String[] args) {

        // 1) Sum of Numbers
        System.out.println("Sum of numbers is:" + add());

        // 2) Find Maximum
        System.out.println("Max number is:" + max(89, 2, 70, 3, 5, 69));

        // 3) Count Elements
        System.out.println("No of arguments passed is:" + countElements(1, 5, 7, 8, 9));

        // 4) Print All Values
        System.out.println("The values of arguments are :");
        printValues(1, 2, 3, 4);

        // 5) Count Even Numbers
        System.out.println("Even numbers:" + countEven());

        // 6) Average Calculator
        System.out.println("Average :" + averageCalc(10, 20, 30));
        System.out.println("Average :" + averageCalc(5));
        System.out.println("Average :" + averageCalc());

        // 7) Minimum Value
        System.out.println("Min value is:" + minValue(10, 5, 3, 20));
        System.out.println("Min value is:" + minValue(7));
        System.out.println("Min value is:" + minValue());

        // 8) Product of Numbers
        System.out.println("Product of numbers:" + product(2, 3, 4));
        System.out.println("Product of numbers:" + product(5));
        System.out.println("Product of numbers:" + product());

        // 9) Search a Target (Boolean)
        System.out.println("Target is present:" + ispresent(5, 1, 3, 5, 7));
        System.out.println("Target is present:" + ispresent(10, 1, 3, 5));
        System.out.println("Target is present:" + ispresent(4));

        // 10) Sum of Odd Numbers
        System.out.println("Sum of even parameters is :" + sumOfOdd(1, 2, 3, 4, 5));
        System.out.println("Sum of even parameters is :" + sumOfOdd(2, 4, 6));
        System.out.println("Sum of even parameters is :" + sumOfOdd());

    }

    // 1) Sum of Numbers
    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // 2) Find Maximum
    static int max(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No arguments are passed!!!");
            return 0;
        }
        int maxNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }

    // 3) Count Elements
    static int countElements(int... numbers) {
        return numbers.length;
    }

    // 4) Print All Values
    static void printValues(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("no values to print");
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // 5) Count Even Numbers
    static int countEven(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No arguments passed");
            return 0;
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // 6) Average Calculator
    static double averageCalc(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("Warning no arguments passed!!!");
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

    // 7) Minimum Value
    static int minValue(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No arguments passed!!!");
            return Integer.MAX_VALUE;
        }
        int countmin = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < countmin) {
                countmin = numbers[i];
            }
        }
        return countmin;
    }

    // 8) Product of Numbers
    static int product(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No arguments passed!!");
            return 1;
        }
        int prod = 1;
        for (int i = 0; i < numbers.length; i++) {
            prod *= numbers[i];
        }
        return prod;
    }

    // 9) Search a Target (Boolean)
    static boolean ispresent(int target, int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No arguments passed");
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return true;
            }
        }
        return false;
    }

    // 10) Sum of Odd Numbers
    static int sumOfOdd(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No arguments passed!!");
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}
