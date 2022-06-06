package leetCode;

public class SellStock {
    public static int maxProfit(int[] prices) {
        int min_value = Integer.MAX_VALUE;//1
        int max_Profit = 0;//4
        for (int i = 0 ; i<prices.length ; i++){
            if (prices[i]<min_value)
                min_value = prices[i];
            else if (prices[i]-min_value > max_Profit)
                max_Profit = prices[i]-min_value;
        }
        return max_Profit;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,6,4,3,1}));
    }
}
