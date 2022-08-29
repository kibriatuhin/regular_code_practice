package leetcode2;

public class PalindromeString {
    static boolean palindrome(String a){
        if (a.length() == 0 || a.length()==1){
            return true;
        }
        if (a.charAt(0) == a.charAt(a.length()-1)){
            return palindrome(a.substring(1,a.length()-1));
        }else
            return false;
    }
    public static void main(String[] args) {
        palindrome("tut");
    }
}
