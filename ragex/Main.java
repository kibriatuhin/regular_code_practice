package ragex;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class  Employe{
    String name ;
    double salary;
    String distic;

    public Employe(String name, double salary, String distic) {
        this.name = name;
        this.salary = salary;
        this.distic = distic;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", distic='" + distic + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {5,6,3,4};
        int count = 0;
        Predicate<Integer> p = i-> i%2==0;
        for (int ar : array)
            if (p.test(ar)) {
               count++;
                //System.out.println(ar);
            }
        System.out.println(count);
    }
}
