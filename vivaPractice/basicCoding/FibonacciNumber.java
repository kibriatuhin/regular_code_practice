package vivaPractice.basicCoding;

public class FibonacciNumber {
    static void fiboNumber(int n){
        int fast = 0 , last = 1 , fibo;
        System.out.print(fast + " " + last + " ");
        for (int i = 3 ; i<=n  ; i++){
            fibo = fast + last;
            System.out.print(fibo + " ");
            fast = last;
            last = fibo;
        }
    }
    public static void main(String[] args) {
        fiboNumber(5);
    }
}

class FibonacciUsingRecursion{
    static void fiboNumber(int first , int second , int n){
        if (n==0){
            return;
        }
        int fibo = first + second;
        System.out.print(fibo + " ");
        fiboNumber(second, fibo, n-1);
    }
    public static void main(String[] args) {
        int first = 0 , second = 1 ;
        System.out.print(first + " " + second+ " ");
        fiboNumber(first,second,3);
    }
}
