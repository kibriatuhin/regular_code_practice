package leetCode;

import java.util.Scanner;

public class ValidPalineDrom {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.toLowerCase();
        int left =0 , right = s.length()-1;
        while (left < right){
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("rarr"));
        Scanner sc=new Scanner(System.in);

    }
}
