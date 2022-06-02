package leetCode;

public class PalindromeNumber {

    static  boolean checkPalindromeNumber(int num){

        int sum =0 , temp = num ,rem;
        if (num< 0) return  false;
        while (temp!=0){
            rem= temp % 10;//1 2 1
            sum = sum * 10 + rem;//121
            temp = temp /10;//12 1 0
        }
        if (num == sum) return  true;

        return false;
    }

    public static void main(String[] args) {
        int n = 124;
        System.out.println(checkPalindromeNumber(n));

    }
}
