package leetCode;

public class StringReverse {
    public static String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int l = 0 , r = k-1;
        while (l<r){
            char temp = ch[l];
            ch[l++] = ch[r];
            ch[r--] = temp;
        }
        String s1 = new String(ch);
        return s1;
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("abcd",2));
    }
}


