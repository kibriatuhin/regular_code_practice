package vivaPractice.basicCoding;

public class PalindromeNumber {
    static boolean isPalindrome(int n){
        int rem ,temp = n, digit =0;
        while (temp!=0){
            rem = temp%10;
            digit  = digit*10 + rem;
            temp /= 10;
        }
        if (n==digit)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
}
