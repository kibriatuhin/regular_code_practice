package solidPrinciple;

public class Main {
    public static void main(String[] args) {
        /*SMS ob = new SMS();
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(ob,"Send successfull");
        Mail mail = new Mail();
        notificationService.sendNotification(mail,"send Successfull");*/

        Product product = new Phone();
        if (product instanceof  Phone){
            Phone ob = (Phone) product;
            ob.mousePadConfig();

        }

    }
}
