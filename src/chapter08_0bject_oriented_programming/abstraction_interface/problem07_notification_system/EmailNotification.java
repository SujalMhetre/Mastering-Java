package chapter08_0bject_oriented_programming.abstraction_interface.problem07_notification_system;

public class EmailNotification implements Notification {

    @Override
    public void send(){
        System.out.println("Email notification sent");
    }
}
