package solid.ecomerce;

import solidPrinciple.NotificationType;

public class NotificationService {

    public void sendNotification(NotificationType type, String message){
        type.notify(message);
    }
}
