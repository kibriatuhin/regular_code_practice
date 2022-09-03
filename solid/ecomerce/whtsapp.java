package solid.ecomerce;

import java.io.FileNotFoundException;

public class whtsapp implements SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {
       throw  new RuntimeException("not available");
    }
}
