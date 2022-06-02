package solidPrinciple;

public class SMS implements NotificationType{

    @Override
    public void notify(String message) {
        System.out.println("SMS :: " + message);
    }
}
