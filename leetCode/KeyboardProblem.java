package leetCode;

import java.util.*;

public class KeyboardProblem {
    public static void main(String[] args) {
        String s = "abcdef";
        String s2 = "abdg";
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()){
            list.add(c);
        }
        System.out.println(list);
       // String rst ="";
        char[] array = s2.toCharArray();
        int n =0;
        for (int i=0 ; i< array.length ; i++){
            if (!list.contains(array[i]))
                n=1;

        }
        if (n==0)
            System.out.println(s2);
        else
            System.out.println("false");

    }
}

class Testttt{
    public static String[] findWords(String[] words) {
        String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};

        List<String> result = new LinkedList<>();
        for (String word : words){
            String temp = word.toLowerCase();
            int searchRow =0;
            if (keyboard[1].contains(String.valueOf(temp.charAt(0))))
                searchRow =1;
            else if (keyboard[2].contains(String.valueOf(temp.charAt(0))))
                searchRow =2;
            boolean b = true;

            for (int i=0 ; i<word.length() ; i++){
                if (!keyboard[searchRow].contains(String.valueOf(temp.charAt(i)))){
                    b = false;
                    break;
                }

            }
            if (b)
                result.add(word);

        }
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        String[] s = findWords(new String[]{"Hello","Alaska","Dad","Peace"});
        System.out.println(Arrays.toString(s));
    }
}