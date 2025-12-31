package chapter10_collections.arraylist.problem_02_access_update;

import java.util.ArrayList;

public class ArrayListUpdate {
    public static void main(String[] args) {

        ArrayList<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Coconut");
        fruitsList.add("Banana");
        fruitsList.add("Mango");
        fruitsList.add("Kiwi");

        System.out.println(fruitsList.get(1));

        fruitsList.set(1, "Strawberry");

        System.out.println(fruitsList.get(1));

        System.out.println(fruitsList);

    }
}
