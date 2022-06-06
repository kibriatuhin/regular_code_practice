package vivaPractice.dataStructure;

public class BinarySearch {
    static int binarySearch(int[] array , int value){
        int first = 0,last = array.length-1,mid;
        while (first<=last){
            mid = first + (last -1)/2;
            if (array[mid]==value)
                return mid;
            if (array[mid]> value)
                last = mid-1;
            else
                first = mid +1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {10,15,20,25,30,35,40};
        //binarySearch(array,20);
        System.out.println(binarySearch(array,20));
    }
}
//using recursion

 class BinarySearchUsingRecurssion{
    static int binarySearch(int[] array , int first , int last , int value){
        //int mid;
        if (first <= last){
            int mid  = first + (last -1 )/2;
            if (array[mid] == value)
                return  mid;
            else  if (array[mid]>value)
                return binarySearch(array,first,mid-1,value);
            else
                return binarySearch(array,mid+1, last,value);
        }

        return  -1;
    }
     public static void main(String[] args) {
         int[] array = {10,15,20,25,30,35,40};
         System.out.println(binarySearch(array,0,array.length-1,20));
     }
 }



 class Practice{
     static int binarySearch(int array[] ,int x){
         int l =0 ,r = array.length-1;

         while (l<=r){
             int mid= l+(r-l)/2;
             if (array[mid]==x)
                 return mid;
             if (array[mid]<x)
                 l = mid + 1;
             else
                 r = mid-1;
         }
         return -1;

     }
     public static void main(String[] args) {

     }
 }
