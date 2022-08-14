package uva;

import java.util.Scanner;

public class OddSum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int tstCase = sc.nextInt(),count=0;
            for (int i=0 ; i< tstCase ; i++){
                short x = sc.nextShort() , x2 = sc.nextShort();
                int sum = 0;
                for (int j=x ; j<=x2 ; j++){
                    if (j%2 ==1){
                        sum = sum +j;
                    }
                }
                count++;
                System.out.println("Case " + count + ": " + sum);
            }




    }
}
