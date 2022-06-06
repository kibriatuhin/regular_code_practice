package solid;

public class Sms  implements NotificationType {

    @Override
    public void notify(String message) {
        System.out.println("Sms : " + message);
    }
}
