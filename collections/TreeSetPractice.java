package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {

        Comparator<Integer> c  = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1<o2)
                    return 1;
                else  if (o1>o2)
                    return -1;
                return 0;
            }
        };
        Set<Integer> set = new TreeSet<>(c);
        set.add(10);
        set.add(5);
        set.add(1);
        set.add(11);
        System.out.println(set);
        System.out.println(((TreeSet<Integer>) set).comparator());
    }
}
