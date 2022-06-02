package leetCode;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] map = new int[26];
        for (int i=0 ; i< s.length() ; i++){
            map[s.charAt(i)-'a']++;
        }
        int[] map2 = new int[26];
        for (int i=0 ; i< t.length() ; i++){
            map2[t.charAt(i)-'a']++;
        }
       /* System.out.println(Arrays.toString(map));
        System.out.println(Arrays.toString(map2));*/

        for (int i=0 ; i<26 ; i++){
            if (map[i] != map2[i])
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(isAnagram("rat","car"));
    }
}

class  Test00{
    public static boolean isAnagram(String s, String t) {
        int n = s.length();
        if (n != t.length())
            return false;
        final  int[] count = new int[26];
        int i=-1;
        while (++i<n){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(count));
        for (int cn : count){
            if (cn != 0)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println( isAnagram("anagram","nagaram"));
    }
}
