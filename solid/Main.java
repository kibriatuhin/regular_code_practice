package solid;

public class Main {

    public static void main(String[] args) {
        NotificationType sms = new Sms();
        NotificationServices notificationServices = new NotificationServices();
        notificationServices.sendNotification(sms,"phone");
    }
}
