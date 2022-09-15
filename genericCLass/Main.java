package genericCLass;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Iterator;

interface A {

}
interface B{

}
interface C extends A{

}

class Aa {

}
class Bb{

}
class Cc extends Aa{

}
class Dd extends Cc{

}

class Test<T>{
    private T t ;

    T add(T t){
        return this.t = t;
    }
    void print(){
        System.out.println(t);
    }

}

public class Main {
    public static void main(String[] args) {

        ArrayList<Cc> arrayList = new ArrayList<>();
        ArrayList<Dd> arrayList1 = new ArrayList<>();

        m(arrayList1);

    }
    static void m(ArrayList<? extends Cc> arrayList){

    }
}
