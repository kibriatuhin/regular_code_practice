package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s ;
        for (int i=0 ; i<n ; i++){
            s = sc.next();
            char[] ch = s.toCharArray();
            //System.out.println(Arrays.toString(ch));
            int sum =0,sum1=0;
            for (int j= 0 ; j< 3 ; j++){
                //System.out.println(ch[i]);
                sum = sum + Integer.parseInt(String.valueOf(ch[j]));
            }
           // System.out.println(sum);
            for (int j= ch.length-3 ; j< ch.length ; j++){
                //System.out.println(ch[i]);
                sum1 = sum1 + Integer.parseInt(String.valueOf(ch[j]));
            }
           // System.out.println(sum1);
            if (sum == sum1)
                System.out.println("Yes");
            else
                System.out.println("no");

        }
    }
}



class DbService{
    //methods
    public void save(){
        System.out.println("save");
    }
}

class Main{
    private  DbService dbService;
    public static void main(String[] args) {
        Main ob = new Main();
        ob.operation();
    }
    public void operation(){
        dbService.save();
    }
}