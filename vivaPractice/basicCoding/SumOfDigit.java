package vivaPractice.basicCoding;

public class SumOfDigit {
    static void sumOfDigit(int n){
        int rem,sum =0 ;
        while (n!=0){
            rem = n % 10;
            sum +=rem;
            n /=10;
        }
        System.out.println("Sum of digit : " + sum);
    }
    public static void main(String[] args) {
        sumOfDigit(123);
    }
}

class ReverseNumber{
    static void reverseNumber(int n){
        int rem , digit =0;
        while (n!=0){
            rem = n%10;
            digit  = digit*10 + rem;
            n /= 10;
        }
        System.out.println(digit);
    }
    public static void main(String[] args) {
        reverseNumber(123);
    }
}
