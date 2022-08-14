package vivaPractice.dataStructure;

import java.util.Arrays;

public class MargeSort2 {
    static void conquer(int[] array , int st, int md , int ed){
        int[] marged = new int[ed - st +1];

        int indx1 = st;
        int indx2 = md+1;
        int x =0;
        while (indx1 <= md && indx2<= ed){
            if (array[indx1] <= array[indx2])
                marged[x++] = array[indx1++];
            else
                marged[x++] = array[indx2++];
        }
        while (indx1 <= md){
            marged[x++] = array[indx1++];
        }
        while (indx2 <= ed){
            marged[x++] = array[indx2++];
        }

        for (int i=0,j=st; i< marged.length ; i++,j++){
            array[j] = marged[i];
        }

    }

    static void divide(int[] array , int st , int ed){
        if (st >= ed){
            return;
        }

        int mid = st + (ed-st)/2;
        divide(array,st,mid);
        divide(array,mid+1, ed);
        conquer(array,st,mid,ed);
    }
    public static void main(String[] args) {
        int[] array = {4,2,9,1,5,3};
        divide(array,0,array.length-1);

        System.out.println(Arrays.toString(array));
    }
}
