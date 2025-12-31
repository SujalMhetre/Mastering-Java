package chapter10_collections.arraylist.problem_06_search_element;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        System.out.print("Enter a number to search in the arraylist :");
        int search = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (search == list.get(i)) {
                System.out.println("number found at index :" + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        scanner.close();
    }
}
