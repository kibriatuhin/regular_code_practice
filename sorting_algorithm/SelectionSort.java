package sorting_algorithm;

import java.util.Arrays;

public class SelectionSort {
    static void ascendingOrder(int[] number)
    {
        for (int i=0 ; i < number.length-1 ; i++)
        {
            int smallest = i;
            for (int j=i+1 ; j< number.length ; j++)
            {
                if (number[smallest] > number[j])
                {
                    smallest = j;
                }


            }
            int temp = number[smallest];
            number[smallest] = number[i];
            number[i] = temp;
        }

        System.out.println(Arrays.toString(number));
    }
    public static void main(String[] args) {
        int[] number = {7,8,3,1,2};
        //System.out.println(number.length);
        ascendingOrder(number);
    }
}
