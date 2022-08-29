package leetcode2;

import java.util.*;

public class DupplicateValue {

    //iterative way
    static boolean dupplicate(int[] array ){
        for (int i=0 ;i<array.length ; i++){
            for (int j=i+1; j<array.length ; j++){
                if (array[i] == array[j]){
                    //System.out.println("true");
                    return true;
                }
            }
        }
        return false;
    }

    // using set
    static void dupplicate1(int[] array){
        Set<Integer> set = new HashSet<>();

        for (int i=0 ; i<array.length ; i++){
            if (set.add(array[i]) == false){
                System.out.println(array[i]);
                break;
            }
        }

    }

    //using map

    static void dupplicate2(int[] array){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0 ;i<array.length ; i++){
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                map.put(array[i],map.get(array[i])+1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() >1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    //leetcode
    static int dupplicatElement(int[] nums){
        Set<Integer> set = new HashSet<>();

        for (int i=0 ; i<nums.length ; i++){
            set.add(nums[i]);
        }
        int size = set.size();
        return size;

    }
    static int dupplicateElement(int[] nums){
        int fst =0 , slow=1;
        while (fst<nums.length)
        {
            if (nums[fst] != nums[fst+1]) {
                nums[slow++] = nums[fst+1];
            }
            fst++;
        }
        return slow;

    }


    public static void main(String[] args) {
        int[] array = new int[]{1,1,2};

        System.out.println(dupplicatElement(array));

    }
}
