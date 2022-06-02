package leetCode;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseString(char[] s) {
        int left = 0,right = s.length-1;
        while (left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        char[] st = {'h','e','l','l','o'};
        reverseString(st);
    }
}
