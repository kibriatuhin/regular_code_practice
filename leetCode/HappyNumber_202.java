package leetCode;

public class HappyNumber_202 {

    public static boolean isHappy(int n) {
        int fast = n ;
        int slow = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (fast != slow);

        if (slow ==1 ){
            return  true;
        }
        return  false;

    }

    private static   int findSquare(int n){
        int temp = 0 ,rem;
        while (n>0){
            rem = n%10;
           temp += rem * rem;
           n /= 10;
        }
        return  temp;
    }
    public static void main(String[] args) {

        boolean reslt = isHappy(19);
        System.out.println(reslt);
    }
}
