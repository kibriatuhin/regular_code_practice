package recursion;

import java.util.Arrays;

//print number from 5 to 1
public class Recursion1 {
    public static void printNumber(int n){

        if (n==0)
            return;

        System.out.print(n + " ");
        printNumber(n-1);
       // System.out.println("hudai");
    }
    public static void main(String[] args) {
        printNumber(5);
    }
}

//print number from 1 to 5

class  Recursion2{
    public static void printNumber(int n){
        if (n==6){
            return;
        }

        System.out.print(n + " ");
        printNumber(n+1);
    }
    public static void main(String[] args) {
        printNumber(1);
    }
}

//print sum of first n natural numbers
class Recursion3{
    static void printSum(int i, int n , int sum){
        if (i==n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printSum(i+1 , n , sum);
        System.out.println(i);
    }

    public static void main(String[] args) {
        printSum(1,5,0);
    }
}

//print factorial of a number n
class Recursion4{
    static int factorial(int n){
        if(n==1 || n==0)
            return 1;
        int fact_num1 = factorial(n-1);
        int fact_n = n * fact_num1;
        return fact_n;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

//print the fibonacci sequence till nth term
class Recusion5{
    static void fibonacci(int n,int a, int b ){

        if (n==0)
            return;
        int c = a +b;
        System.out.print(c + " ");
        fibonacci(n-1,b,c);

    }

    public static void main(String[] args) {
        int n = 7,a=0,b=1;
        System.out.print(a + " " + b + " ");
        fibonacci(n-2,a,b);
    }
}
//print x^n
class Recursion6{
    static void printMul(int x , int n){

    }
    public static void main(String[] args) {

    }
}

//print power of hanoi
class Recursion7{
    static void hanoi(int n , String src , String helper , String dest){
        if (n==1){
            System.out.println(" Transfer disk " + n + "from " + src + " to " + dest);
            return;
        }
        hanoi(n-1 , src,dest,helper);
        System.out.println(" Transfer disk " + n + "from " + src + " to " + dest);
        hanoi(n-1, helper,src,dest);
    }

    public static void main(String[] args) {
        int n =2;
        hanoi(n , "S","H","D");
    }
}

// print string reverse
class  Recursion8{
    static void reverseString(String s , int length){
        if (length == -1)
            return;
        System.out.print(s.charAt(length) + " ");
        reverseString(s,length-1);
    }
    public static void main(String[] args) {
        String s = "tuhin";
        reverseString(s,s.length()-1);
    }
}
//Move all 'x' to the end
class Recursion9{
    static void moveAll(String oldString , int idx , int count , String newString){
        if (idx == oldString.length()){
            System.out.println(newString);
            for (int i=0  ; i<count ; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char ch = oldString.charAt(idx);
        if (ch == 'x'){
            count++;
            moveAll(oldString,idx+1 , count, newString);
        }else {
            newString += ch;
            moveAll(oldString,idx+1,count,newString);
        }

    }
    public static void main(String[] args) {
        String s = "abxdxxr";

        moveAll(s,0,0,"");
    }
}

//remove duplicate element
class Recursion10{
    static boolean[] map = new boolean[26];
    static void removeDuplicate(String st , int index, String newString){
        if (index == st.length()){
            System.out.println(newString);
            return;
        }
        char ch = st.charAt(index);
        if (map[ch- 'a']== true){
            removeDuplicate(st , index+1,newString);
        }else {
            newString += ch;
            map[ch- 'a'] = true;
            removeDuplicate(st , index+1,newString);
        }
    }
    public static void main(String[] args) {
        String s = "abaddt";
        removeDuplicate(s,0,"");
    }
}
//print all the subsequence of  a string

class Recursion11{
    static void subsequence(String st , int idx , String newString){

        if (idx == st.length()){
            System.out.println(newString);
            return;
        }
        char ch = st.charAt(idx);
        subsequence(st,idx+1 , newString+ch);

        subsequence(st,idx+1 , newString);
    }
    public static void main(String[] args) {
        String name = "abc";
        subsequence(name , 0 , "");
    }
}

class Recursion11Practice{
    static void sub(int s[] , int idx){
        int subset_size = (int) Math.pow(2,idx);
        for (int i=0 ; i<subset_size ; i++){
            int[] subset = new int[idx];
            for (int j=0 ; j<idx ; j++){
                if ((i & (int) Math.pow(2,j)) != 0){
                    subset[j] = s[j];
                }
            }
            System.out.println(Arrays.toString(subset));
        }
    }
    public static void main(String[] args) {
        int[] n = {1,2,3};
        sub(n,n.length);
    }
}
