package codeForces;

import java.lang.reflect.Array;
import java.util.*;

class ContestProblemA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(), k= sc.nextInt();

        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        long[] reslt = new long[k];
        for (int i = 0; i < n; i++) {
            reslt[i % k] += array[i];
           // System.out.println(Arrays.toString(reslt));
        }
        Arrays.sort(reslt);
        System.out.println(reslt[0]);

    }
}
class Testttt{
    public static void main(String[] args) {
        System.out.println(5%3);
    }
}
/*
char[] ch = s.toCharArray();
            int l=0 , r = ch.length-1;
            while (l<r){
                char temp = ch[l];
                ch[l++] = ch[r];
                ch[r--] = temp;
            }
            String reslt = new String(ch);
            if (s.equals(reslt)){
                count++;
            }else {
                continue;
            }
*/

/*
class ContestProblemH {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;
        for (int i=0 ; i<n-1 ; i++){
            result  *= 2 ;
        }
        System.out.println(result);
    }
}
*/

