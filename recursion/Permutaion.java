package recursion;

public class Permutaion {
    static void permutaion(String str , String permutaion){
        if (str.length() ==0){
            System.out.println(permutaion);
            return;
        }

        for (int i=0 ;i<str.length() ; i++){

            //current character
            char currentChar = str.charAt(i);

            String newStr = str.substring(0,i) + str.substring(i+1);
            permutaion(newStr,permutaion+currentChar);
        }
    }
    public static void main(String[] args) {
        permutaion("abc" , "");
    }
}
