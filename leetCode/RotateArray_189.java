package leetCode;

import java.util.Arrays;

public class RotateArray_189 {
    public static   void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums,0,nums.length-k-1);
        reverse(nums, nums.length-k , nums.length-1);
        reverse(nums,0,nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    public static   void reverse(int[] nums , int start , int end){
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};
        int k = 3;
        rotate(array, k);


    }
}

class Test5{
    public static   void rotate(int[] nums, int k){
        for (int i=0 ; i<=k ;i++){
            leftSwapOfElement(nums);
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void leftSwapOfElement(int[] nums){
        int temp = nums[0];
        for (int i=0 ; i<nums.length-1 ; i++){

            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = temp;
    }

    public static void main(String[] args) {
         rotate(new int[]{-1,-100,3,99} , 3);
    }
}
