import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

class A{
    public static void main(String[] args) {

       Student s1 = new Student(15,"Tuhin" , 3.5f);
       Student s2 = new Student(15,"Tethye" , 2.5f);
       Student s3 = new Student(15,"Tuhin" , 3.5f);
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"tuhin");
        map.put(2,"tethye");
        map.put(3,"tamim");
        System.out.println("Orginal : "+map);
       map.computeIfAbsent(12, new Function<Integer, String>() {
           @Override
           public String apply(Integer integer) {
               return "jodu";
           }
       });
        System.out.println(map);

    }
}

final class Student{
    private final int id;
    private final String name;
    private final float cgpa;

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public float getCgpa() {
        return cgpa;
    }



    public Student(int id, String name  , float cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}

class Test{
    public static void main(String[] args) {

        ABC ob = new CDE(1);
    }
}

class ABC{
    static {
        System.out.println("Static block of ABC");
    }
    public ABC(){
        System.out.println("No argument constructor of ABC");
    }
    public ABC(int n){
        System.out.println("Parameterized constructor of ABC " );
    }
}

class CDE extends ABC{
    static {
        System.out.println("Static block of CDE");
    }
    public CDE(){
        System.out.println("No argument Constructor of CDE ");
    }
    public CDE(int n){
        System.out.println("Parameterized constructor of CDE");
    }
}


class Testtt{
   void m2(Testtt obj){
       System.out.println("method call successfully done");
       m3();
   }
   void m3(){
       System.out.println("amar kaj nai kono ");
   }
   void m1(){
       m2(this);
   }
    public static void main(String[] args) {
        Testtt obj = new Testtt();
        obj.m1();
    }
}

class B{

}
class A4{

}


class Recursion{
    static void print(int n ){
        //base case
        if (n==11){
            return;
        }
        System.out.println(n);
        print(n+1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(1);
    }
}


