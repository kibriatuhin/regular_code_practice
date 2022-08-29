package leetcode2;

public class twoSum {
    static void   twoSum(int[] nums , int target){
        //int[] array = new int[2];
        for (int i=0 ; i<nums.length ; i++){
            for (int j =i+1 ; j< nums.length ; j++){
                if (nums[i]+nums[j] == target)
                    System.out.println(i + " " + j);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,5,8};
        twoSum(array,7);
    }
}
