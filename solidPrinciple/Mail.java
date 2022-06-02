package solidPrinciple;

public class Mail implements NotificationType {
    @Override
    public void notify(String message) {
        System.out.println("Mail :: " + message);
    }
}
