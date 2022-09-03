package leetcode2;

import java.sql.Array;
import java.util.Arrays;
import java.util.TreeSet;

public class MergeTwoArray {

    static void merge(int[] nums1, int[] nums2 , int m , int n){
        int[] array = new int[m+n];

        for (int i=0 ; i<m ; i++){
            array[i] = nums1[i];
        }
        for (int i=0 ; i< n ; i++){
            array[m+i] = nums2[i];
        }
        System.out.println(Arrays.toString(array));
    }

    static void merge2(int[] nums1, int m , int[] nums2 , int n){
        int i=--m+--n+1;
        while (m>=0 && n>=0){
            if (nums1[m] > nums2[n]){
                nums1[i--] = nums1[m--];
            }else {
                nums1[i--] = nums2[n--];
            }
        }

        while (m>=0){
            nums1[i--] = nums1[m--];
        }
        while (n>=0){
            nums1[i--] = nums2[n--];
        }

    }
    public static void main(String[] args) {
        int[] array1 = {1,4,7,0,0,0};
        int[] array2 = {2,3,6};
        merge2(array1,3,array2 , array2.length);
       /* TreeSet<Integer> set = new TreeSet<>();


        for (int i=0 ; i< array1.length; i++){
            set.add(array1[i]);
        }
        for (int i=0 ; i< array2.length ; i++){
            if (!set.contains(array2[i])){
                set.add(array2[i]);
            }
        }
        System.out.println(set);*/
    }
}


