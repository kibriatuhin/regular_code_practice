package leetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class dupplicateValue {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0 ;i<nums.length ; i++){
            if (map.containsKey(nums[i]) && i-map.get(nums[i]) <= k)
                return true;
            map.put(nums[i],i);
        }
        //System.out.println(map);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},3));
    }
}
