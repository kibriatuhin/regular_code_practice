package codeForces;

import org.omg.CORBA.INTERNAL;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int arraySize ;

        for (int i=0 ;i<testCase ; i++){

            arraySize = sc.nextInt();
            int[] array = new int[arraySize];
            for (int j=0 ;j<array.length ; j++)
                array[j] = sc.nextInt();

            //System.out.println(Arrays.toString(array));
            Map<Integer,Integer> map = new HashMap<>();
            int ans = -1;
            for (int j=0 ; j<array.length ; j++){

                if (map.containsKey(array[j])){
                    map.put(array[j],map.get(array[j])+1);
                    if (map.get(array[j])>2){
                        ans = array[j];
                        break;
                    }
                }
                else
                    map.put(array[j],1);

            }
            System.out.println(ans);


        }
    }
}

class Testt{
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] array = {1,2,3};

        for (int i=0 ;i<array.length ; i++){
            map.put(array[i],0);
        }
        System.out.println(map);
    }
}
