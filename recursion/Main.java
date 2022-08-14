package recursion;

import java.math.BigInteger;

public class Main {
    static void  solve(int m){
        System.out.print("before solv method: ");
        System.out.println(m);
        if (m==0)
            return;

        solve(m-1);
        System.out.print("after solv method :");
        System.out.println(m);
    }
    public static void main(String[] args) {
        solve(5);
    }
}

class Fact{
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        System.out.print(factorial(new BigInteger("100000")));
    }
}

class ReversString{
    public static String reverseString(String s) {

        String[] strs = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String str : strs){
            StringBuffer temp = new StringBuffer(str);
            sb.append(temp.reverse());
            sb.append(" ");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Let's take LeetCode contest"));
    }
}

class  Test{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("tuhin");
        System.out.println(sb.length());
        sb.setLength(sb.length()-1);
        System.out.println(sb.length());

    }
}
 class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class outer{
    protected void m(){
        System.out.println("parnt");
    }
}
class  Mainnn extends outer{

    public void m(){
        System.out.println("jj");
     }

    public static void main(String[] args) {
        BigInteger ob = BigInteger.ONE;
        System.out.println(ob.intValue());
    }
}




