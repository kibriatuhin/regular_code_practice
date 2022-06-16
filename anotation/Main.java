package anotation;

import anotation.anotation.Component;

import java.lang.annotation.*;

@Target(value = ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
@Documented
@interface  IntVal{

}
public class Main {

    @IntVal // eta thakle dekhabe j ay field ar jonno doc ace. r jodi na dei tahole doc ar vitor thakbena fiel ta
    private int id;

    /*
    * this is our main method..
     */
    public static void main(String[] args){

    }
    /*
    *this is simplemethod
    * this method name is fun()
     */
    public void fun(){

    }

}


@Component
class  A{

}
class B extends A{

}