package java_regex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        boolean flag ;
        Scanner sc = new Scanner(System.in);
        do {
            String digit = "\\w{3,10}@gmail.com";
            System.out.println("Input an Integer = " );
            String input = sc.next();
            flag = input.matches(digit);
            if (!flag)
                System.out.println("Invalid!");
            else {
                System.out.println("valid ");
            }

        }while (!flag);
    }
}

class Tst{
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            StringBuilder builder = new StringBuilder();
            char[] ch = s.substring(0,s.indexOf('@')).toCharArray();
            for (char c : ch) {
                if (c == '+')
                    break;
                else if(c == '.')
                    continue;
                else
                    builder.append(c);
            }
            builder.append(s.substring(s.indexOf('@'),s.length()));
            set.add(builder.toString());
        }
        return set.size();

    }
    public static void main(String[] args) {

        }


}