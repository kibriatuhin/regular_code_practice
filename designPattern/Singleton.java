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
//iger process
class  DataSourcePractice{
    private static final  DataSourcePractice dataSource = new DataSourcePractice();
    private DataSourcePractice(){

    }
    public static DataSourcePractice getInstance(){
        return dataSource;
    }
}
class SingletoPractice{
    public static void main(String[] args) {
        DataSourcePractice sourcePractice = DataSourcePractice.getInstance();
        System.out.println(sourcePractice);
        fun();
    }
    public static void fun(){
        DataSourcePractice ob = DataSourcePractice.getInstance();
        System.out.println(ob);
    }
}
//lazy process
class DataSourceLazy{
    private static  DataSourceLazy dataSourceLazy = null;
    private DataSourceLazy(){

    }
    public static DataSourceLazy getInstance(){
        if (dataSourceLazy==null){
             dataSourceLazy = new DataSourceLazy();
        }
        return dataSourceLazy;
    }
}
class SingletonWIthLazy{
    public static void main(String[] args) {
        DataSourceLazy ob = DataSourceLazy.getInstance();
        System.out.println(ob);
        fun();
    }
    static void fun(){
        DataSourceLazy ob = DataSourceLazy.getInstance();
        System.out.println(ob);
    }
}

