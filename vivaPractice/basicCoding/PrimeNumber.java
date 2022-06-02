package vivaPractice.basicCoding;

public class PrimeNumber {

    static boolean primeNumber(int n){
        int count = 0;
        if (n==0 || n==1)
            return false;
        for (int i =2  ; i<n ; i++){
            if (n%i ==0 ){
                count++;
                break;
            }
        }
        if (count==0)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        System.out.println(primeNumber(2));
    }
}

class  PrimePractice{
    static  void primeNumber(int n){
        int count=0 ;
        if (n==0 || n==1)
            System.out.println("no prime number of " + n);
        for (int i=2 ; i<=n ; i++){
            for (int j=2 ; j<i ; j++)
            {
                if (i%j ==0){
                    count++;
                    break;
                }
            }
            if (count==0)
                System.out.println(i);
            count =0;
        }

    }
    public static void main(String[] args) {
        primeNumber(10);
    }
}
