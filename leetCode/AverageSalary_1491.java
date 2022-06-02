package leetCode;

import java.util.Arrays;

public class AverageSalary_1491 {
    public static double average(int[] salary) {

        double result = 0,sum=0;
        Arrays.sort(salary);
        for (int i=1 ; i<salary.length -1 ; i++){
            sum = sum +  salary[i];
        }
        result = sum / (salary.length-2);
        return  result;

    }
    public static void main(String[] args) {
        int[] n = {4000,3000,1000,2000,5000};
        System.out.println(n.length-2);
        System.out.println(average(n));

    }
}

class Outer{


    public static void main(String[] args) {

    }
}
