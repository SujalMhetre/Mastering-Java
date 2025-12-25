package chapter10_collections.arraylist.problem_03_remove_elements;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Coconut");
        list.add("Banana");
        list.add("Mango");
        list.add("Kiwi");

        list.remove(1);
        System.out.println(list);

        list.remove("Banana");
        System.out.println(list);

    }
}
