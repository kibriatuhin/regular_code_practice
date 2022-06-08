package leetCode;

import java.util.*;

public class IntersectionOfTwoArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums1){
            set.add(n);
        }
        List<Integer> list = new ArrayList<>();
        for (int n : nums2){
            if(set.contains(n)){
                list.add(n);
                set.remove(n);
            }
        }
        int[] ar = new int[list.size()];
        for (int i=0 ; i<ar.length ; i++){
            ar[i] = list.get(i);
        }
        return ar;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,4},new int[]{4,2,6})));
    }
}

class Problem2{
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();

        int i=0 ,j=0;
        while (i<nums1.length && j<nums2.length){
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;

            }else if (nums1[i]<nums2[j])
                i++;
            else
                j++;
        }
        int[] ar = new int[list.size()];
        for (int k=0 ; k<ar.length ; k++){
            ar[k] = list.get(k);
        }
        return ar;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,4},new int[]{4,2,6})));
    }
}
class Practice3{
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<Integer>();

        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        int[] res = new int[list.size()];
        for(int k = 0; k<res.length; k++){
            res[k] = list.get(k);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,4},new int[]{4,2,6})));
    }
}