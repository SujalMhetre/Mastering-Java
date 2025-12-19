package chapter08_0bject_oriented_programming.abstraction_interface.problem07_notification_system;

public class Main {
    public static void main(String[] args) {

        Notification[] notifications = {new EmailNotification(), new SMSNotification(), new PushNotification()};

        for (Notification notification : notifications) {
            notification.send();
        }
    }
}
