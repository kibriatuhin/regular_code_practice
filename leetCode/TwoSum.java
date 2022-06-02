package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int[] twoSum(int[] nums , int targets){
        int value , rem , index;
        HashMap<Integer , Integer> hashMap = new HashMap<>();

        //storing data into Map
        for (int i=0  ; i<nums.length ; i++){
            hashMap.put(nums[i],i);
        }
        //search data
        for (int i=0 ; i< nums.length ; i++){
            value = nums[i];//2
            rem = targets - value;//2
            if (hashMap.containsKey(rem)){
                index = hashMap.get(rem);
                if (index == i) continue;
                return  new int[]{i, index};
            }
        }

        return new  int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,23};
        int targets = 4;

        int[] result = TwoSum.twoSum(nums,targets);
        for (int i=0 ; i<result.length ; i++){
            System.out.println();
        }




    }
}


class Practice{
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
       /* int left =0 ,right= numbers.length-1;
        while (left<right){
            if ((numbers[left] + numbers[right]) == target){
                result[0] = left+1;
                result[1] = right+1;
                break;
            }
            if ((numbers[left] + numbers[right]) > target)
                right--;
            else
                left++;
        }*/
       //using map

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0 ; i< numbers.length ; i++){
            if (hashMap.containsKey(target - numbers[i])){
                result[0] = hashMap.get(target - numbers[i])+1;
                result[1] = i+1;
                break;
            }
            hashMap.put(numbers[i],i);
        }

        return result;

    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,23};
        int targets = 9;
        System.out.println(Arrays.toString(twoSum(nums,targets)));

    }
}