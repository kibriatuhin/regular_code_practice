package leetCode;

import java.util.Arrays;

public class PlusOne_66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1 ; i>=0 ; i--){
            if (digits[i]!=9){
                digits[i]++;
                break;
            }else {
                digits[i]=0;
            }
        }
        if (digits[0]==0){
            int[] res = new int[digits.length + 1];
            res[0] =1;
            return  res;
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] sum = {9,9};
        int[] result = plusOne(sum);
        System.out.println(Arrays.toString(result));

    }
}
