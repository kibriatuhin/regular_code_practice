package leetCode;

import java.util.HashSet;
import java.util.Set;

public class EqualEmail {
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
