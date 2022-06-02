package sorting_algorithm;

import java.util.Arrays;

public class InsertionSort {
    static void ascendingOrder(int[] number)
    {
        for (int i =1 ; i<number.length  ; i++)
        {
            int current = number[i];
            int j = i-1;
            while (j>=0 && current < number[j])
            {
                number[j+1] = number[j];
                j--;
            }

            number[j+1] = current;
        }
        System.out.println(Arrays.toString(number));
    }
    public static void main(String[] args) {
        int[] number = {7,8,3,1,2};
        ascendingOrder(number);
    }
}
