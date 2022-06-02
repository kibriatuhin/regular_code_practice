package vivaPractice.basicArray;

public class MisingNumber {
    static void missingNumber(int[] array){
        int expecedNumber = array.length +1,sum =0;
        int totalSum = (expecedNumber*(expecedNumber+1))/2;
        for (int i=0 ; i<array.length ; i++){
            sum = sum + array[i];
        }
        System.out.println("Missing Number : " + (totalSum - sum));
    }
    public static void main(String[] args) {
        missingNumber(new int[]{1,2,3,4,6});
    }
}
