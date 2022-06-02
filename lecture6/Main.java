package lecture6;

import java.io.IOException;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
   /* static void m(int n){
        System.out.println("int m");
    }*/
    static void m(char c){
        System.out.println("char c");

    }
    /*static void m(Integer m){
        System.out.println("Integer m");
    }*/
   /* static void m(long l){
        System.out.println("Long l");
    }*/
   /* static void m(float f){
        System.out.println("float f");
    }*/
   /* static void m(double d){
        System.out.println("double");
    }*/
    static void m(Character c){
        System.out.println("character c");
    }
    public static void main(String[] args) {

       // m(8);
    }
}

class  Parent{

    /*Parent(){
        System.out.println("parent class default constructor");
    }*/
    Parent(){
        System.out.println("Parameterized constructor..");
    }

}
class Child extends Parent{

    Child(){
        //super();
        System.out.println("child class constructor");
    }

}


