package chapter14_anonymous_classes;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {


        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

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
