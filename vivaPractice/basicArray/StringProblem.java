package vivaPractice.basicArray;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        Pattern p = Pattern.compile("[0-9[ ]]");
        Matcher m = p.matcher(st);
        while (m.find()){
            System.out.print(m.group());
        }

    }
}

/*

 */
 final class  Test {
   final private int a ;
   final private int b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
     String ob = "tuhin";
     String ob1 =new String("tuhin");
        System.out.println(ob==ob1);
    }

}
