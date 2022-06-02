package leetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;

class FirstUniqueElement {
    public static int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                int n = map.get(ch);
                map.put(ch,++n);
            }else
                map.put(ch,1);
        }
       // System.out.println(map);
        for (int i=0 ; i< s.length() ; i++){
            if (map.get(s.charAt(i))==1)
                return i;
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
