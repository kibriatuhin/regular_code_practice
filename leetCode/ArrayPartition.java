package leetCode;

import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum =0;
        for (int i=0 ; i<nums.length ; i+=2){
            sum +=nums[i];
        }
        return sum;
    }
    static {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        System.out.println("main ");
    }
}
