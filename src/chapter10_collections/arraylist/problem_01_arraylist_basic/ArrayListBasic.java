package chapter10_collections.arraylist.problem_01_arraylist_basic;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Vegatables");
        shoppingList.add("Snacks");
        shoppingList.add("Clothes");
        shoppingList.add("Fruits");
        shoppingList.add("Choclates");


        for (String shoppinglist : shoppingList) {
            System.out.println(shoppinglist);
        }


    }
}
