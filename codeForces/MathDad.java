package codeForces;

import java.util.Scanner;

public class MathDad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i=0 ; i<testCase ;i++){
            int n = sc.nextInt();
            StringBuilder st =new StringBuilder();
            int count=0,j=0;
            if (n%3==0){
                count = n/3 ;
                while (j<count){
                    st.append("21");
                    j++;
                }

            }else if (n%3==1){
                count = n/3 ;
                while (j<count){
                    st.append("12");
                    j++;
                }
                st.append("1");
            }else {
                count = n/3 ;
                while (j<count){
                    st.append("21");
                    j++;
                }
                st.append("2");
            }
            System.out.println(st);
        }

    }
}
