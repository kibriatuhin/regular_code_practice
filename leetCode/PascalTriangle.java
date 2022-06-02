package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PascalTriangle {
    public static void main(String[] args) {
        for (int i=0 ; i<5 ; i++){
            //space
            for (int j=1 ; j<5-i ;j++){
                System.out.print(" ");
            }
            //
            int number =1;
            for (int k=0 ; k<=i ; k++){
                System.out.print(number + " ");
                number = number * (i-k)/(k+1);
            }
            System.out.println();
        }
    }
}
class Practidsce{
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i=1 ; i<=numRows; i++){
            List<Integer> row = new ArrayList<>();
            for (int j=0 ; j< i  ; j++){
                if(j==0 || j==i-1)
                    row.add(1);
                else
                    row.add(result.get(i-2).get(j) + result.get(i-2).get(j-1));
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
   generate(5);
    }
}

class Practiccce{
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0 ;i<nums.length ; i++){
            if (set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }
}