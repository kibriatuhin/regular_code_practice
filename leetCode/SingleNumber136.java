package leetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber136 {
    static void countFrequency(int[] array){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i<array.length ; i++){
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer> e : map.entrySet()  ){
            if (e.getValue() ==1){
                System.out.println(e.getKey());
            }
           // System.out.println(e.getKey() + " " + e.getValue());
        }
    }
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i<nums.length ; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer> e : map.entrySet()  ){
            if (e.getValue() ==1){
                return e.getKey();
            }
            // System.out.println(e.getKey() + " " + e.getValue());
        }
        return -1;
    }

    public static void main(String[] args) {
       // countFrequency(new int[]{1,2,3,1,2,3,3,4});
        System.out.println(singleNumber(new int[]{1}));
    }
}
