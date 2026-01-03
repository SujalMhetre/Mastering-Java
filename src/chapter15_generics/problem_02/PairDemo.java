package chapter15_generics.problem_02;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> days = new Pair<>(1, "Sunday");

        System.out.println(days.getKey());
        System.out.println(days.getValue());

        Pair<Integer, Integer> scores = new Pair<>(3, 5);

        System.out.println(scores.getKey());
        System.out.println(scores.getValue());
    }
}
