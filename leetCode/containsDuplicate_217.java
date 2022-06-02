package leetCode;

import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicate_217 {
    public static boolean containsDuplicate(int[] nums) {

        for (int i=0 ; i<nums.length ; i++){
            for (int j = i+1 ; j<nums.length ; j++){
                if (nums[i]==nums[j])
                    return  true;

            }
        }
        return  false;

    }
    public static void main(String[] args) {
        int[] n = {1,2,3,4};
        System.out.println(containsDuplicate(n));
    }
}
// using collection framwork

class UsingCollection{
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0 ; i<nums.length ; i++){
            if (hashSet.contains(nums[i])){
                return  true;
            }
            hashSet.add(nums[i]);
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] n = {1,2,3,1};
        System.out.println(Arrays.toString(n));
        System.out.println(containsDuplicate(n));
    }
}
