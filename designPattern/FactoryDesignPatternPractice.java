package designPattern;

public class FactoryDesignPatternPractice {
    public static void main(String[] args) {
        Device device = DeviceFactory.create(Type.PHONE);
        System.out.println(device.config());

        Device device1 = DeviceFactory.create(Type.LAPTOP);
        System.out.println(device1.config());
    }
}

enum Type{
    PHONE,LAPTOP;
}
interface Device{
    String config();

}
class Phone implements Device{

    @Override
    public String config() {
        return "Ram:: 2gb CPU::snapDragon storrage :: 64gb";
    }
}

class Laptop implements Device{

    @Override
    public String config() {
        return "Ram:: 8gb CPU :: i5 storage :: 1TB";
    }
}

class DeviceFactory{
    public static Device create(Type type){
        if (type.equals(Type.PHONE)){
            return new Phone();
        }else if (type.equals(Type.LAPTOP)){
            return new Laptop();
        }
        return null;
    }
}