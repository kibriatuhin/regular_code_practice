package leetcode2;

import java.util.Arrays;

public class InsertElement {
    static int[] insertElement(int[] array , int position , int value ){
        int[] newArray = new int[array.length+1];
        for (int i=0 ; i< newArray.length ; i++){
            if (i<position)
                newArray[i] = array[i];
            else if (i==position)
                newArray[i] = value;
            else
                newArray[i] = array[i-1];
        }
        return newArray;
    }

    static int[] insertElement2(int[] array , int position , int value){
        for (int i = array.length-1 ; i> position ; i--){
            array[i] = array[i-1];
        }
        array[position] = value;
        return array;
    }

    public static int searchInsert(int[] nums, int target) {
        int left =0 , right = nums.length-1;
        while (left <=right){
            int mid = left + (right-left)/2;

             if (nums[mid] < target)
                left = mid +1;
            else
                right = mid-1;
        }
        return right+1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,5};


        System.out.println(searchInsert(array,3));

    }
}
