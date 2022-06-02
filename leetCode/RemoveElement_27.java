package leetCode;

import java.util.Arrays;

public class RemoveElement_27 {
     static int removeElement(int[] nums, int val) {
        int start = 0,i;
        for (i =0 ; i<nums.length ; i++){
            if (nums[i]!=val){
                nums[start++] = nums[i];

            }


        }
        return  start;
    }
    public static void main(String[] args) {
         int[] arrays = {0,1,2,2,3,0,4,2};
         int target = 2;
         int result = removeElement(arrays,target);
        System.out.println(result);
    }
}
