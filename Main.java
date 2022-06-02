import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;
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

class Student{
    int id;
    String name;
    float cgpa;

    public Student(int id, String name  , float cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Student)obj).id;
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

    }
}