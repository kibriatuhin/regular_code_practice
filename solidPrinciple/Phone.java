package solidPrinciple;

public class Phone implements Product {
    @Override
    public void ramConfig() {

    }

    @Override
    public void storageConfig() {

    }

    @Override
    public void cpuConfig() {

    }

    @Override
    public void displayConfig() {

    }

    @Override
    public void mousePadConfig() {
        throw new RuntimeException("not available");
    }
}
