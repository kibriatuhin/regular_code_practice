package vivaPractice.dataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] array){
        for (int i=0 ; i< array.length-1 ; i++){
            int small_idx = i;
            for (int j = i+1 ; j< array.length ; j++)
                if (array[small_idx]> array[j])
                    small_idx = j;
            int temp = array[small_idx];
            array[small_idx] = array[i];
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        selectionSort(new int[] {3,2,5,1});
    }
}
