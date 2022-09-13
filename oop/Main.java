package oop;

import java.lang.reflect.Array;
import java.util.Arrays;

class Parent{
    public void m1(){
        System.out.println("parent method");
    }
}
class Child extends Parent{
    public void m1(int n){
        System.out.println("child method");
    }
}

public class Main {


    public static void m(char n){
        System.out.println("char ");
    }
    public static void m(Character n){
        System.out.println("Character ");
    }

    public static void m(Long n){
        System.out.println("Long ");
    }

    public static void main(String[] args) {
        Main.m(5l);
    }

}

class Parent2{
        void parentMethod(){
        System.out.println("parent method");
    }
}
class Child2 extends Parent2{

    @Override
    public  void parentMethod(){
        System.out.println("child method");
    }
}

class Test2{
    public static void main(String[] args) {
        Child2 ob = new Child2();
        ob.parentMethod();
    }
}


interface A{
    default void m1(){
        System.out.println("interfac A method m2");

    }
}
interface B{
    default void m1(){
        System.out.println("interface B method m1");
    }
}
class C{
   public void m1(){
        System.out.println("class C");
    }
}
class TestInterface extends C implements A,B{


    public static void main(String[] args) {
        TestInterface ob = new TestInterface();
        ob.m1();

    }

}

class Test44{
    public static void main(String[] args) {
        int[] array = {-1,-3,4,2};
        for (int i=0 ;i< array.length; i++){
            array[i] = (int) Math.pow(array[i],2);
        }
        System.out.println(Arrays.toString(array));
    }
}
