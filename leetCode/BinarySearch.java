package leetCode;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int target = 6;

        int left=0 , right= nums.length-1 , middle ;
       while (left<=right){
           middle = (left + right)/2;
           if (nums[middle] == target){
               System.out.println("founded : " + middle);
               return;
           }
           else  if(nums[middle]< target)

               left = middle + 1;
           else
               right = middle - 1;
       }
        System.out.println("No found");

    }
}

class  BinarySearch2 {
     static int searchInsert(int[] nums, int target) {
         //Arrays.sort(nums);

         int left = 0 , right = nums.length-1 , middle ;

         while (left<=right){
             middle = left + (right-left)/2;
             if (nums[middle]==target)
                 return  middle;
             else if (nums[middle]<target)
                 left = middle + 1;
             else
                 right = middle -1;

         }
         return right+1;


    }
    public static void main(String[] args) {
         int[] number = {1,3,5,6};
         int target = 4;

        System.out.println(searchInsert(number,target));


    }
}
