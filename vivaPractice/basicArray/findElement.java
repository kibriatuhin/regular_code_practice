package vivaPractice.basicArray;

public class findElement {
    static boolean findElement(int[] array,int number){
        for (int i=0 ; i< array.length ; i++){
            if (array[i] == number)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array  = {1,2,3,4,5};
        int number = 7;
        System.out.println(findElement(array,number));
    }
}
