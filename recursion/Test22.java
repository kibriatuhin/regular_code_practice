package recursion;

public class Test22 {
    static int factorialNumber (int n){
        if (n==1 || n ==0)
            return 1;
        int fac_n1 = factorialNumber(n-1);
        System.out.println(" fac_n1 : " + fac_n1);
        int factorial = n * fac_n1;
        return factorial;
    }
    public static void main(String[] args) {
       int resutl =  factorialNumber(5);
        System.out.println(resutl);
    }
}

//string reverse

class StringReverse{
    static void reverseString(String str , int idx){
        
    }
    public static void main(String[] args) {

    }
}
