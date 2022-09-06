package oop;

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
    public static void parentMethod(){
        System.out.println("parent method");
    }
}
class Child2 extends Parent2{

    public static void parentMethod(){
        System.out.println("child method");
    }
}

class Test2{
    public static void main(String[] args) {
        Child2 ob = new Child2();
        ob.parentMethod();
    }
}


