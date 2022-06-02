package designPattern;

public class Singleton{
    public static void main(String[] args) {
        DataSource source = DataSource.getInstance();
        System.out.println(source);
        fun();
    }
    public  static void fun(){
        DataSource source = DataSource.getInstance();
        System.out.println(source);
    }

}

 class DataSource {
    private static final  DataSource ob = new DataSource();
    private DataSource(){

    }
    public static DataSource getInstance(){
        return ob;
    }

    public void save(){
        System.out.println("save");
    }
    public void delete(){
        System.out.println("delete");
    }
}
