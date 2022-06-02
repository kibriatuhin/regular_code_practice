package vivaPractice.dataStructure;

import java.util.Arrays;

public class MargeSort {

    static  void conquer(int[] array , int si , int md , int ei){
        int[] marged = new int[ei-si +1];

        //first array point
        int idx1 = si;
        //second array point
        int idx2 = md+1;
        //marged point
        int x =0;
        while (idx1<=md && idx2<=ei){
            if (array[idx1]<=array[idx2]){
                marged[x++] = array[idx1++];
            }else {
                marged[x++] = array[idx2++];
            }
        }
        while (idx1<=md){
            marged[x++] = array[idx1++];
        }
        while (idx2<=ei){
            marged[x++] = array[idx2++];
        }

        for (int i=0 , j=si; i<marged.length ; i++,j++){
            array[j] = marged[i];
        }

    }
    static void divide(int[] array , int si, int ei){
        if (si>=ei){
            return;
        }
        //divide array
        int md = si + (ei-si)/2;
        // divide firt part
        divide(array,si,md);
        //divide second part
        divide(array,md+1 , ei);
        //marge array
        conquer(array,si,md,ei);



    }
    public static void main(String[] args) {
        int[] array = {3,2,5,1};
        divide(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
