package leetcode2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s){
        Map<String , Integer> map = new LinkedHashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int rslt = map.get(s.charAt(s.length()-1));

        for (int i=s.length()-2 ; i> 0 ; i--){
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
                rslt -= map.get(s.charAt(i));
            else
                rslt += map.get(s.charAt(i));
        }

        return rslt;

    }

    public static void main(String[] args) {

    }
}
