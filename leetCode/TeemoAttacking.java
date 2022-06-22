package leetCode;

public class TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalTime = timeSeries.length * duration;
        int diff=0;
        for (int i=0 ; i<timeSeries.length-1 ; i++){
            if (timeSeries[i]+duration >= timeSeries[i+1])
                diff += timeSeries[i]+duration - timeSeries[i+1];
        }

        return totalTime-diff;
    }
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1,2},2));

    }
}
