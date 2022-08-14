package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRank {
    public String[] findRelativeRanks(int[] score) {
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        Map<Integer,String> map = new HashMap<>();
        String[] result = new String[score.length];
        for (int i=score.length-1 ; i>=0 ;i--){
            if (i==score.length-1)
                map.put(sorted[i],"Gold Medal");
            else if (i==score.length-2)
                map.put(sorted[i] ,"Silver Medal");
            else if (i==score.length-3)
                map.put(sorted[i],"Bronze Medal");
            else
                map.put(sorted[i],String.valueOf(score.length-i));
        }
        for (int i=0 ; i<score.length ;i++){
            result[i] = map.get(score[i]);

        }
        return result;

    }
    public static void main(String[] args) {

    }
}
