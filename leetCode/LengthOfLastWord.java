package leetCode;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        int max =0;
        for (int i=0 ; i<split.length ; i++)
            if (split[i].length() != 0){
               return split[split.length-1].length();
            }

         return max;
    }
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));
    }
}
