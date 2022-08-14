package codeForces;

import java.util.Scanner;

public class MarinProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i=0 ; i<testCase ;i++){
            int n = sc.nextInt();
            int count =0;
            char[] ch = sc.next().toCharArray();
            for (int j=0 ;j<n-1 ; j++){
                try{
                    if (ch[j]=='0' && ch[j+1]=='0')
                        count+=2;
                    else if (ch[j]=='0' && ch[j+1]=='1' && ch[j+2]=='0')
                        count +=1;
                }catch (Exception e){

                }

            }
            System.out.println(count);
        }
    }
}

class Tessst{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j=0 ;j<n ; j++){
            String s = sc.next();
            int count=0;
            char[] ch = s.toCharArray();
            for (int k=0 ; k <ch.length-1 ; k++){
                if (ch[k]==ch[k+1])
                    count +=2;
            }
        }
    }
}