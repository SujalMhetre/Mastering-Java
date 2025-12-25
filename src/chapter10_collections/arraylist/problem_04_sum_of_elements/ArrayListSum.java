package chapter10_collections.arraylist.problem_04_sum_of_elements;

import java.util.ArrayList;

public class ArrayListSum {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
