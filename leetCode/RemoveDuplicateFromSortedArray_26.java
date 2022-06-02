package leetCode;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray_26 {
    public static int removeDuplicates(int[] nums) {
        int i,start=0;
        for(i=0 ; i<nums.length-1 ; i++)
        {
            if(nums[i]!=nums[i+1])
                nums[start++]=nums[i];

        }
        nums[start]= nums[nums.length-1];
        return start+1;
    }
    public static void main(String[] args) {
        int[] arrays = {1,2,2,3,4,4,5};
        System.out.println(removeDuplicates(arrays));
    }
}
