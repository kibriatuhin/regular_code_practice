package exceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

class Parent{
    public void m1() throws IOException {
        System.out.println("Parent method call");
    }
}
class Child extends  Parent{
    @Override
    public void m1()   {
        System.out.println("child method call");
    }
}

class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(){
        super("Invalid age");
    }
    public InvalidAgeException(String message){
        super(message);
    }
}


public class Main {
    public static void main(String[] args) {
        int age = 16;
       if (age < 18){
           throw new InvalidAgeException("please provide valid age");
       }else {
           System.out.println("valid age");
       }
    }
}
