package chapter10_collections.arraylist.problem_05_find_min_max;

import java.util.ArrayList;

public class ArrayListMinMax {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        int min = list.get(0);
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }

        System.out.println("Min :" + min);
        System.out.println("Max :" + max);
    }
}
