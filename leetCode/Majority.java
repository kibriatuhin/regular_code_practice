package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Majority {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i<nums.length ; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer> e : map.entrySet()  ){
            if (e.getValue() >(nums.length/2)){
                return e.getKey();
            }
            // System.out.println(e.getKey() + " " + e.getValue());
        }
        return -1;

    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
    }
}
