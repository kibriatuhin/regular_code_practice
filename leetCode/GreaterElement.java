package leetCode;

import java.util.*;

public class GreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i: nums2){
            while (!stack.isEmpty() && stack.peek()<i)
                map.put(stack.pop(),i);
            stack.push(i);
        }

        int[] reslt = new int[nums1.length];
        for (int i=0 ; i<reslt.length ; i++){
            reslt[i] = map.getOrDefault(nums1[i],-1);
        }
        //System.out.println(Arrays.toString(reslt));
        return reslt;

    }
    public static void main(String[] args) {
        nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
    }
}

class Psractice{
    public static void main(String[] args) {
        Stack<Integer>  stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.peek();
        System.out.println(stack.peek());
    }

}
