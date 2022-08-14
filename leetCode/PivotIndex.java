package leetCode;

import java.util.Arrays;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        if (nums.length ==0)
            return -1;
        for (int i=1 ; i<nums.length ; i++){
            nums[i] += nums[i-1];
        }
       // System.out.println(Arrays.toString(nums));
        int last = nums.length-1;
        if (nums[last] - nums[0] ==0)
            return 0;
        for (int i=1 ; i< nums.length ; i++ )
            if (nums[last]-nums[i]==nums[i-1])
                return i;

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
