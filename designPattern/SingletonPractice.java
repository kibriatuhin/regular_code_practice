package designPattern;

import javax.xml.crypto.Data;

class Database{
   private static Database database = null;
   private Database(){

   }
   public synchronized static Database getInstance(){
       if (database == null){

           synchronized (Database.class){
               if (database == null){
                   database = new Database();
               }
           }

       }
       return database;
   }
}

public class SingletonPractice {
    public static void main(String[] args) {
        Database ob = Database.getInstance();
        System.out.println(ob);
        fun();
    }
    static void fun(){
       Database database = Database.getInstance();
        System.out.println(database);
    }
}

