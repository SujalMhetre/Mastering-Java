package chapter10_collections.arraylist.problem_08_remove_duplicates;

import java.util.ArrayList;

public class ArrayListRemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.add(10);

        ArrayList<Integer> list2 = new ArrayList<>();

        // Without using Built in methods .contains()
        for (Integer element1 : list1) {

            boolean isDuplicate = false;

            for (Integer element2 : list2) {
                if (element1.equals(element2)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                list2.add(element1);
            }
        }

        // Using builtin method contains()
//        for (int i = 0; i < list1.size(); i++) {
//            if (!list2.contains(list1.get(i))) {
//                list2.add(list1.get(i));
//            }
//        }

        System.out.println(list2);

    }
}
