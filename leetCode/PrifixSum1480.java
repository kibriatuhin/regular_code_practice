package leetCode;

import java.util.Arrays;

public class PrifixSum1480 {
    public static int[] runningSum(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i=1 ;i< nums.length ; i++){
            newArray[0] = nums[0];
            newArray[i] = newArray[i-1] + nums[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4})));
    }
}
