package collections;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(44,"t");
        map.put(1,"tuhin");
        map.put(2,"tamim");
        map.put(3,"tethye");
        map.put(3,"tethyuuuue");
        //System.out.println(map);
        map.merge(40 ,"tamimmmm", (i,j)-> {
            return i + j;
        });
        map.forEach((i,j)-> System.out.println(i+" " + j));
    }
}
