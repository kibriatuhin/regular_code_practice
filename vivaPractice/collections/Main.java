package vivaPractice.collections;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.UnaryOperator;

public class Main {

}
//ArrayList
class TestMethod{

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i=5 ; i<10 ; i++)
            list.add(i);
        System.out.println("Orginal LinkedList : " + list);
        Iterator<Integer> iterator = list.descendingIterator();
        iterator.forEachRemaining(System.out::println);
        System.out.println(list.get(2));
    }
}
