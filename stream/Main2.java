package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,5};

        List<Integer> list = new ArrayList<>();
        for (int n: array)
            list.add(n);

       /* Stream<Integer> stream = list.stream();
        Stream<Integer> stream1 = stream.distinct();
        stream1.parallel().forEachOrdered(System.out::println);*/
      List<Integer> list1 =  list.stream().sorted((i,i2)-> i2-i).filter(i-> i%2!=0).collect(Collectors.toList());
        System.out.println(list1);



    }
}
//practice array
class ArrayPractice{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,2};
        IntStream stream =  Arrays.stream(array).distinct().filter(i->i%2==0);
        stream.forEach(System.out::println);
    }
}
