package designPattern;


interface TwoPinSocket{
    void pluginToTwoPointSocket();
}
interface ThreePinSocket{
    void pluginToThreePointSocket();
}
class TVCableSocket implements TwoPinSocket{

    @Override
    public void pluginToTwoPointSocket() {
        System.out.println("plugin two pin socket");
    }
}
class LaptopCableSocket implements ThreePinSocket{

    @Override
    public void pluginToThreePointSocket() {
        System.out.println("Plugin three pin socket");
    }
}

class ThreePinToTwoPinAdapter implements TwoPinSocket{
    private ThreePinSocket socket;
    ThreePinToTwoPinAdapter(ThreePinSocket socket){
        this.socket = socket;
    }

    @Override
    public void pluginToTwoPointSocket() {
        System.out.println("Using adapter: ");
        socket.pluginToThreePointSocket();
    }
}
public class AdapterDesignPattern {
    public static void main(String[] args) {
        TwoPinSocket twoPinSocket = new TVCableSocket();
        twoPinSocket.pluginToTwoPointSocket();
        /*ThreePinSocket threePinSocket = new LaptopCableSocket();
        threePinSocket.pluginToThreePointSocket();*/
        TwoPinSocket twoPinSocket1 = new ThreePinToTwoPinAdapter(new LaptopCableSocket());
        twoPinSocket1.pluginToTwoPointSocket();

    }
}

