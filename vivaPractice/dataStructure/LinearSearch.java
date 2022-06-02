package vivaPractice.dataStructure;

public class LinearSearch {
    static int linearSearch(int[] array , int value){
        int rslt = -1;
        for (int i=0 ; i< array.length ; i++){
            if (array[i] == value){
                rslt = i;
                break;
            }
        }
        return rslt;
    }
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int reslut = linearSearch(array,10);
        System.out.println(reslut);
    }
}
