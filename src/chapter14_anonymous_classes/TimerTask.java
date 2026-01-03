package chapter14_anonymous_classes;

import java.util.Timer;

public class TimerTask {
    public static void main(String[] args) {

        Timer timer = new Timer();

        java.util.TimerTask task = new java.util.TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if (count <= 0) {
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);

    }
}
