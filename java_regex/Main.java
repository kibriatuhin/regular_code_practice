package java_regex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int x=3,y=20;
        x = (x & y) + (x/y);
        y = x & (~y) + 1;
        x=x & (~y) +1;
        System.out.println(x + " " + y);

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