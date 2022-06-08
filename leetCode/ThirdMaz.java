package leetCode;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ThirdMaz {
    public static int thirdMax(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : nums){
            set.add(n);
        }
        System.out.println(set);
        int[] ar = new int[set.size()];
        int index =0;
        for (Integer n : set)
            ar[index++] = n;
        Arrays.sort(ar);
       if (ar.length>=3){
           return ar[ar.length-3];
       }else {

           return ar[ar.length-1];
       }

    }
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2,2,5,3,5}));
    }
}
