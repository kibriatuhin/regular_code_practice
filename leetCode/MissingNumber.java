package leetCode;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum = 0;
       for (int n : nums){
           sum +=n;
       }
        int expectedSum = 0;
       for (int i=1 ; i<=nums.length ;i++){
           expectedSum +=i;
       }
       // System.out.println(expectedSum);
       return expectedSum - sum;
    }
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {1,2,0,4}));
    }
}
