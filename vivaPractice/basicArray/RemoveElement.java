package vivaPractice.basicArray;

import java.util.Arrays;

public class RemoveElement {
    static void removeElement(int[] array , int val){
        int index = -1;
        for (int i=0 ; i<array.length ; i++){
            if (array[i] == val)
                index = i;

        }
        if (index >=0)
        {
            for (int i = index ; i< array.length-1 ; i++){
                array[i] = array[i+1];
            }
        }
        array[array.length-1] =0;

        System.out.println(Arrays.toString(array));


    }
    public static void main(String[] args) {
        removeElement(new int[]{1,2,3,4,5},2);
    }
}
