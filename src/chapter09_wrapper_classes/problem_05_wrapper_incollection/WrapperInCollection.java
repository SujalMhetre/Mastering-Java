package chapter09_wrapper_classes.problem_05_wrapper_incollection;

import java.util.ArrayList;

public class WrapperInCollection {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;
        System.out.println(numbers);
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
