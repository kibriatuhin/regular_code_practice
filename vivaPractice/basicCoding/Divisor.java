package vivaPractice.basicCoding;

public class Divisor {
    static void findAndPrintDivisors(int n){
        int count = 1 ;
        for (int i=1 ; i<= n/2 ; i++){
            if (n%i==0){
                count++;
                System.out.println(i);
            }

        }

        System.out.println(n);

        System.out.println("divisor count : " + count);
    }

    public static void main(String[] args) {
        findAndPrintDivisors(10);
    }
}

class  Divisor2{
    static void findAndPrintDivisors(int n){
        int maxD =(int) Math.sqrt(4);
        for (int i=1 ; i<=maxD ; i++)
            if (n%i ==0){
              //if divisor are equal jst print 1
                if (n/i == i)
                    System.out.println(i);
                else {
                    System.out.print(i + " ");
                    System.out.print(n/i + " ");
                }
            }
    }
    public static void main(String[] args) {
       findAndPrintDivisors(10);

        //System.out.println(maxD);
    }
}
class Test{
    static void divisor(int n){
        int divCount = 0;
        for (int i=1 ; i<= n/2;i++ ){
            if (n%i ==0){
                System.out.println(i);
                divCount++;
            }
        }
        System.out.println(divCount);
    }
    public static void main(String[] args) {
        divisor(5);
    }
}

