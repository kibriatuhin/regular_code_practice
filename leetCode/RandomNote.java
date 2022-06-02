package leetCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class RandomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        int count = 0;
        for (char c : magazine.toCharArray())
            map.put(c , map.getOrDefault(c,0)+1);
        //System.out.println(map);
        for (char c : ransomNote.toCharArray()){
            if (map.containsKey(c) && map.get(c) !=0){
                map.put(c , map.get(c)-1);
                count++;
            }
        }
        //System.out.println(map);
        return count == ransomNote.length();
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
}


class Test10{
  public   static int m;
    void m2(){
        m=120;
       // m1();
        System.out.println("m2");
    }

    static void m1(){
        m=10;
        int n =10;
        System.out.println(n);
    }
    void print(){
        System.out.println(m);
    }

    public static void main(String[] args) {
        m1();
        Test10 ob = new Test10();
        ob.print();
        ob.m2();
        ob.print();
    }
}
