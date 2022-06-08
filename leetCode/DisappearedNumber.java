package leetCode;

import java.util.*;

public class DisappearedNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : nums){
            map.put(n , 1);
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i=1 ;i<=nums.length ; i++){
            if (map.containsKey(i)==false){
                list1.add(i);
            }
        }
        //System.out.println(list1);
        return list1;



    }

    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});

    }
}
