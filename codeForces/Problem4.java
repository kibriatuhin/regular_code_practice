package codeForces;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int arraySize;
        for (int i=0 ; i<testCase; i++){
            arraySize = sc.nextInt();
            int[] array = new int[arraySize];
            for (int j=0 ;j< arraySize ; j++){
                array[j] = sc.nextInt();
            }
            int sum1 = 0;
            for (int s : array){
                sum1 = sum1 +s;
            }
            //System.out.println(sum1);
            int rslt = 0;
            for (int j=0 ; j<arraySize ; j++){
                int sum2 = sum1-array[j];
                int elmnt = array[j];
                int ln = arraySize-1;
                if (sum2%ln ==0 && sum2/ln==elmnt){
                //    System.out.println(elmnt);
                    rslt =1;
                }


            }
            if (rslt ==1 )
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
