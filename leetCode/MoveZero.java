package leetCode;

import java.util.Arrays;

public class MoveZero {
    public static void moveZeroes(int[] nums) {
        int j =0;
        for (int i=0; i<nums.length ; i++) {

            if (nums[i] != 0)
            {
               if(i != j)
               {
                   int temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
               }
               j++;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};
        moveZeroes(array);
    }
}
