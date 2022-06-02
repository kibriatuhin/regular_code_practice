package leetCode;

public class MaximumSubArray_56 {
    public static int maxSubArray(int[] nums) {
        //kadan method
        int bestSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i=0 ;i<nums.length ; i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            bestSum = Math.max(bestSum,currentSum);

        }
        return  bestSum;





        /*//if (nums.length ==0) return  -1;
        int max = Integer.MIN_VALUE;
        for (int i=0 ; i< nums.length ; i++){
            for (int j = i ; j< nums.length ; j++){
                int sum = 0 ;
                for(int k=i ; k<= j ; k++)
                {
                    sum = sum + nums[k];
                }
                max = Math.max(sum , max);
            }
        }
        return max;*/
    }
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(array));
    }
}
