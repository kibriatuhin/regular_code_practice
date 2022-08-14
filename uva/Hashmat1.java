package uva;

import java.util.Scanner;

public class Hashmat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()){
            Long n1 = sc.nextLong();
            Long n2 =sc.nextLong();
            System.out.println(Math.abs(n2-n1));
        }


    }
}

