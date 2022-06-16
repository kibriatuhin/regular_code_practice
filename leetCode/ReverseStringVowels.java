package leetCode;

import java.util.Arrays;

public class ReverseStringVowels {
    public static void main(String[] args) {

    }
}


class Testtt{
    static void stringreverse(String s){
       // System.out.println(s);

        char[] ch = s.toCharArray();
        int l =0 ,r = ch.length-1;
        while (l<r){

            if (!isVowel(ch[l]) && !isVowel(ch[r])){
                l++;r--;
            }
            if (!isVowel(ch[l])) l++;
            else if (!isVowel(ch[r])) r--;
            else {
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
                //System.out.println(Arrays.toString(ch));
            }

        }
        s = String.valueOf(ch);
        System.out.println(s);

    }

    static boolean isVowel(char ch){
        char c = Character.toLowerCase(ch);
        if (c=='a' || c == 'e' || c == 'i' ||c == 'o' || c == 'u')
            return true;
        return false;
    }
    public static void main(String[] args) {
        stringreverse("hello");
    }
}