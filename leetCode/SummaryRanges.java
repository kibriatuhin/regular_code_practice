package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new LinkedList<>();
        int len = nums.length;

        for (int i=0 ; i<len ; i++){
            int fst = nums[i];
            while (i+1<len && nums[i+1] == nums[i]+1)
                i++;
            if (fst != nums[i])
                list.add(fst + "->" + nums[i]);
            else
                list.add(""+nums[i]);

        }
        return list;
    }
    public static void main(String[] args) {

        System.out.println(summaryRanges(new int[]{1,2,3,4,6,7,8,9}));
        /*int[] array = {1,2,3,4,7};


        List<String> list = new ArrayList<>();
      //  int a = array[0];
        int n = array.length;
        for (int i=0  ; i<n ; i++){
           int start = array[i];
           while (i+1<n && array[i+1] == array[i]+1)
               i++;
           if (start != array[i]){
               list.add("" + start + "->" + array[i]);
           }else
               list.add("" + start);
        }
        System.out.println(list);*/
    }
}
