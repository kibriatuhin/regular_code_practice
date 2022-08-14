package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character , Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        Character s_char ,t_char;
        for (int i=0 ; i<s.length() ; i++){
            s_char = s.charAt(i);
            t_char = t.charAt(i);
            if (map.containsKey(s_char)){
                if (map.get(s_char)== t_char)
                    continue;
                else
                    return false;
            }else {
                if (set.contains(t_char)) return false;
                map.put(s_char,t_char);
                set.add(t_char);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
}
