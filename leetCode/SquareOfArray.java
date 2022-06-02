package leetCode;

public class SquareOfArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int low=0 , high= nums.length-1;
        for (int i=nums.length-1 ; i>=0 ; i--){
            if (Math.abs(nums[low])>= Math.abs(nums[high])){
                result[i] = nums[low] * nums[low];
                low++;
            }else {
                result[i] = nums[high] * nums[high];
                high--;
            }
        }

        return  result;
    }
    public static void main(String[] args) {

    }
}
