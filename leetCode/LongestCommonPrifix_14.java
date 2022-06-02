package leetCode;

public class LongestCommonPrifix_14 {
    public static String longestCommonPrefix(String[] strs) {
        String prifix = strs[0];
        for (int i=0 ; i< strs.length ; i++){
            while (strs[i].indexOf(prifix) != 0){
                prifix = prifix.substring(0,prifix.length()-1);
            }
        }
        return prifix;
    }
    public static void main(String[] args) {
        String[] strs = {"mnwer","qrowe","reigwe"};
        System.out.println(longestCommonPrefix(strs));
    }
}
