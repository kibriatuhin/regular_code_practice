package recursion;

public class IncreaseStrickly {
    static boolean increase(int[] array , int index){
        if (index == array.length-1)
            return true;
        if (array[index] < array[index+1]){
            return increase(array,index+1);
        }else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(increase(new int[]{1,9,3,5},0));
    }
}
