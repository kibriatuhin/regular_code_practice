package solid.ecomerce;

import solidPrinciple.NotificationType;

public class Whatsapp implements NotificationType {
    @Override
    public void notify(String message) {
        System.out.println(message);
    }
}
