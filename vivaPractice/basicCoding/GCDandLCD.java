package vivaPractice.basicCoding;

public class GCDandLCD {
    static void findGCD_LCD(int num1 , int num2){

        int rem ,temp1 = num1,temp2 = num2;
        while (num2 != 0){
            rem = num1 % num2;
            num1 =  num2;
            num2 = rem;
        }
        System.out.println("GCD : " + num1);

        System.out.println("LCD : " + (temp1 * temp2)/num1);

    }

    public static void main(String[] args) {
        findGCD_LCD(60,24);
    }
}

class GCDandLCDl{
    static void findGCD_LCD(int n1, int n2){

    }
    public static void main(String[] args) {

    }
}
