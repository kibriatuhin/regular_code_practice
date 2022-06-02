package vivaPractice.basicArray;

public class FindMaxAndMin {
    static void maxMin(int[] array){
        int max =array[0] , min =array[0] ;
        for (int i = 0 ; i<array.length ; i++){
            if (array[i]> max)
                max = array[i];
            if (array[i]< min)
                min = array[i];
        }
        System.out.println( "Max :" +max + " Min :" + min);

    }
    public static void main(String[] args) {
        maxMin(new int[]{1,2,2,3,4,1,3});

    }
}
