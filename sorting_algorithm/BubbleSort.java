package sorting_algorithm;

import java.util.Arrays;

public class BubbleSort {
    static  void ascendingOrder(int[] array)
    {
        for (int i=0 ;i<array.length-1 ; i++){
            for (int j = 0 ; j< array.length -i-1 ; j++)
            {
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static  void descendingOrder(int[] array){
        for (int i=0 ;i<array.length-1 ; i++){
            for (int j = 0 ; j< array.length -i-1 ; j++)
            {
                if (array[j] < array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {7,8,3,1,2};

        // sorting
        System.out.println("Ascending order : ");
        ascendingOrder(array);

        System.out.println("Descending order : ");
        descendingOrder(array);


    }
}

class  Test{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        for (int i=8 ; i>=0 ; i--){
            System.out.println(i);
        }
    }
}
