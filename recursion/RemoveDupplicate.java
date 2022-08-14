package recursion;

public class RemoveDupplicate {
    static boolean[] map =new boolean[26];
    static void removeDupplicate(String str , int idx , String newStr){

        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(idx);
        if (map[ch-'a']== true){
            removeDupplicate(str,idx+1,newStr);
        }else {
            newStr += ch;
            map[ch-'a'] = true;
            removeDupplicate(str,idx+1,newStr);
        }
    }
    public static void main(String[] args) {
        removeDupplicate("tuuhiin",0,"");
    }
}
