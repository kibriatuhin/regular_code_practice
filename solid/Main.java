package solid;





public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Product phone = new Phone();
        if (phone instanceof  Phone){
            Phone ob =(Phone)phone;
            ob.RamConfig();
        }
    }
}

//liskov substitution
interface Product{
    void RamConfig();
    void DisplayConfig();
    void  StorageConfig();

}
interface Computer{
    void MouseConfig();
}
class Phone implements Product{

    @Override
    public void RamConfig() {

    }

    @Override
    public void DisplayConfig() {

    }

    @Override
    public void StorageConfig() {

    }


}
class Laptop implements Product,Computer{

    @Override
    public void RamConfig() {

    }

    @Override
    public void DisplayConfig() {

    }

    @Override
    public void StorageConfig() {

    }

    @Override
    public void MouseConfig() {

    }
}

