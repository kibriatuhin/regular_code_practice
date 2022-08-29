package leetcode2;

public class MaximumSubArray {
    public static void maxSubArray(int[] nums) {
        int bestSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i=0 ; i<nums.length ; i++){
           currentSum += nums[i];
           if (currentSum>bestSum)
               bestSum = currentSum;
           if (currentSum<0)
               currentSum =0;
        }
        System.out.println(bestSum);

    }
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(array);
        //System.out.println(maxSubArray(array));
    }
}

class Test{
   static void sumR(int[] array , int sum , int length){
       if (length<0){
           System.out.println(sum);
           return ;
       }
        sum =sum + array[length];
        sumR(array, sum,length-1);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        sumR(array,0, array.length-1);
    }
}
