package chapter14_anonymous_classes;

public class RunnableProblem {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class");
            }
        };

        runnable.run();
    }
}
