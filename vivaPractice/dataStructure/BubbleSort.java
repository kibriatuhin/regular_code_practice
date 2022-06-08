package vivaPractice.dataStructure;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] array){
       for (int i=0 ;i< array.length-1 ; i++){
           for (int j=0 ; j<array.length-1-i ; j++){
               if (array[j]> array[j+1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
           }
       }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
       bubbleSort(new int[] {3,2,5,1});
    }
}
// using recursion
class BubbleSort2{
    static void bubbleSort(int[] nums , int len){
        //base case
        if (len==1)
            return;
        for (int i=0 ;i< len-1 ; i++){
            if (nums[i] < nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        bubbleSort(nums,len-1);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,5,1};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
