package leetcode2;

public class BinaryNumber {

    public static int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] <target)
                l= mid +1;
            else
                r = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{5,6,7,8,9},7));
    }
}
