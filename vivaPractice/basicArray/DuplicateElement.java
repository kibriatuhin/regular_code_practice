package vivaPractice.basicArray;

public class DuplicateElement {
    static void duplicateElement(int[] array){
        for (int i=0 ; i<array.length ; i++)
            for (int j=i+1 ; j<array.length ; j++)
                if (array[i]==array[j])
                    System.out.print(array[i] + " ");
    }
    public static void main(String[] args) {
        duplicateElement(new int[]{1,2,1,2,3,3,4,5,6});
    }
}
