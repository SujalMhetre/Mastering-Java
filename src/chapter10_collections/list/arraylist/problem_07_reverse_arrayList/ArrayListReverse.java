package chapter10_collections.arraylist.problem_07_reverse_arrayList;

import java.util.ArrayList;

public class ArrayListReverse {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }

        // using for loop
//        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
//            int temp = list.get(i);
//            list.set(i, list.get(j));
//            list.set(j, temp);
//        }

        System.out.println(list);

    }
}
