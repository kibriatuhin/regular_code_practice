package leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int allSum(String s){
        HashMap<Character , Integer> hashMap = new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);

        int result = hashMap.get(s.charAt(s.length()-1));
        for (int i=s.length()-2 ; i>=0 ; i--){
            if (hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i+1)))
                result -= hashMap.get(s.charAt(i));
            else
                result += hashMap.get(s.charAt(i));
        }
        return  result;
    }
    public static void main(String[] args) {
        String s = "VI";
        System.out.println(allSum(s));
    }
}

class Test{
    public static void main(String[] args) {
        String name = "Tuhin";
        System.out.println(name.charAt(2));

    }
}

class  A{
    private final  void show(){
        System.out.println("hl");
    }
}
class  B extends  A{
    public final  void show(){
        System.out.println("b");
    }

    public static void main(String[] args) {
        new B().show();
    }
}
