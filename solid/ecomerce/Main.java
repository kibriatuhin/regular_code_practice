package solid.ecomerce;

import solidPrinciple.NotificationType;

public class Main {
    public static void main(String[] args) {

        SocialMedia socialMedia = new whtsapp();

        if (socialMedia instanceof whtsapp){
            whtsapp ob =(whtsapp) socialMedia;
            ob.groupVideoCall();
        }
    }
}
