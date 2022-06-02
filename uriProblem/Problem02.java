package uriProblem;


import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble(),result;
        result = 3.14159 * (value * value);
        System.out.printf("A=%.4f\n" , result);
    }
}




interface  Tuhin{
    void body();



}
interface Tethye extends Tuhin{
    @Override
    default void body() {
        System.out.println("enjoy");
    }
}





abstract class  Tu{
    abstract void m2();
    abstract void m3();
    Tu(int n){
        System.out.println("tuhin");
    }
}
abstract class Tet extends Tu{
    Tet(int n) {
        super(n);
    }

    @Override
    void m3() {
        System.out.println("tuhin");
    }

    @Override
    abstract void m2() ;
}
class A extends Tet{

    A(int n) {
        super(n);
    }

    @Override
    void m2() {
        System.out.println("tethye");
    }
}

class Main4{
    public static void main(String[] args) {
       // A ob = new A();
       // ob.m3();

    }
}