package leetCode;

public class CountOddNmber_1523 {
    public static int countOdds(int low, int high) {
        int count= (high-low) /2;

        if (low%2 !=0 || high%2 !=0)
            count++;

        return  count;
    }
    public static void main(String[] args) {
        int low = 4, high = 8;
        System.out.println(countOdds(low,high));
    }
}
