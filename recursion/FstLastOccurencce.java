package recursion;

public class FstLastOccurencce {
    static  int fast =-1;
    static  int last = -1;

    static void FastLast(String str , int idx,char element){
        if (idx == str.length()){
            System.out.println(fast + " " + last);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == element){
            if (fast == -1)
                fast = idx;
            else
                last = idx;
        }
        FastLast(str,idx+1, element);
    }
    public static void main(String[] args) {
        FastLast("babreotiatwqoafje",0,'a');
    }
}
