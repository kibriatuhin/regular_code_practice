package leetCode;

public class Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int i=0 , j=0 ;
        if (t.length()==0)
            return false;
        while (j<t.length()){
            if (t.charAt(j)== s.charAt(i))
                i++;
            if (i== s.length())
                return true;
            j++;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
}
