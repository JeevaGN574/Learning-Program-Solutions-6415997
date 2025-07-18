import java.util.*;

public class FactoryMethodPattern{

    interface Notification {
        void notifyUser();
    }

    static class SMSNotification implements Notification {
        public void notifyUser() {
            System.out.println("Sending SMS Notification");
        }
    }

    static class EmailNotification implements Notification {
        public void notifyUser() {
            System.out.println("Sending Email Notification");
        }
    }

    static class PushNotification implements Notification {
        public void notifyUser() {
            System.out.println("Sending Push Notification");
        }
    }

    static class NotificationFactory {
        public static Notification createNotification(String type) {
            if (type == null || type.isEmpty())
                return null;
            if (type.equalsIgnoreCase("SMS"))
                return new SMSNotification();
            else if (type.equalsIgnoreCase("EMAIL"))
                return new EmailNotification();
            else if (type.equalsIgnoreCase("PUSH"))
                return new PushNotification();
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Notification notification = NotificationFactory.createNotification(scan.next());
        notification.notifyUser();
    }
}
