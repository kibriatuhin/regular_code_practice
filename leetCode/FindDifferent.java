package leetCode;

public class FindDifferent {
    public static char findTheDifference(String s, String t) {
        int count1 =0;
        int count2 = 0;
        for (int i=0 ;i<s.length(); i++){
            count1 = s.charAt(i) + count1;
        }
        for (int i=0 ;i<t.length(); i++){
            count2 = t.charAt(i) + count2;
        }
        count2 = count2 - count1;
        System.out.println(count2);

        return  (char) count2;

    }

    public static void main(String[] args) {
        char c = findTheDifference("abcd","abcde");
        System.out.println(c);
    }
}
