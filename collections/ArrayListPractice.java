package collections;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0,"Tuhin");
        hashMap.put(10,"toma");
        hashMap.put(2,"imon");

        hashMap.put(1,"tamim");
        hashMap.put(3,"tethye");
       /* hashMap.merge(5,"tuinn" , (s1,s2)-> {
           // System.out.println(s1 + " " + s2);
            return s1 + "_" +s2;
        });*/
       hashMap.compute(0,(s1,s2)-> {
           return  "]";
       });

        hashMap.forEach((k,v) -> System.out.println(k + " " + v));
    }
}

