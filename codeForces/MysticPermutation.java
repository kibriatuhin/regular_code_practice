package codeForces;

import java.util.*;

public class MysticPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tstCase = sc.nextInt();
        for (int i =0 ; i<tstCase ; i++){
            int arrLen =sc.nextInt();
            if (arrLen ==1 ){
                System.out.println("-1");
                return;
            }
            int[] array = new int[arrLen];
            List<Integer> list = new ArrayList<>();

            for (int j=0 ; j<array.length ;  j++){
                array[j] = sc.nextInt();
                list.add(array[j]);
            }
            list.sort((i1,i2)-> i1-i2);


        }
    }
}
