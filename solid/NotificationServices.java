package solid;

public class NotificationServices {
    public void sendNotification(NotificationType type,String message){
        type.notify(message);
    }
}
