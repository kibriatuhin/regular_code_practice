package uva;

import java.util.Scanner;

public class BeatTheSpread6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i=0 ; i< testCase ; i++){
            int n1 = sc.nextInt() , n2 = sc.nextInt();
            if (n1<n2){
                System.out.println("impossible");
            }else{
                long a , b;
                b = (n1-n2)/2;
                //System.out.println("b = "+b);
                a = n2+b;
                //System.out.println(a);
                if (a+b ==n1 && Math.abs(a-b)==n2)
                    System.out.println(a + " " + b);
                else
                    System.out.println("impossible");
            }



        }
    }
}
