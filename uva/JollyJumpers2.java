package uva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Main{
    static boolean isJolly(int[] array , int n){
        boolean[] bol = new boolean[n];
       // System.out.println(Arrays.toString(bol));
        for (int i=0 ; i< array.length-1 ; i++){
            int num = Math.abs(array[i+1]- array[i]);
            //System.out.println(num);
            if (num == 0 || num > n-1 || bol[num] == true)
                return false;
            bol[num] = true;
           // System.out.println(Arrays.toString(bol));
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int tstCase = sc.nextInt();

            int[] array = new int[tstCase];

            for (int i =0 ;i<array.length ; i++)
                array[i] = sc.nextInt();

          //  System.out.println(isJolly(array,array.length));

         if (isJolly(array,array.length))
             System.out.println("Jolly");
         else
             System.out.println("Not jolly");

        }
    }
}
