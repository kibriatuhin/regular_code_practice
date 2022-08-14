package collections;

import java.util.HashSet;
import java.util.Set;


class Students{
    int id;
    String name;
    float cgpa;

    public Students(int id, String name , float cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Students) obj).id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}

public class SetPractice {
    public static void main(String[] args) {
        Set<Students> set = new HashSet<>();
        Students s1 = new Students(10,"tuhin",3.30f);
        Students s2 = new Students(55, "tethye",3.50f);
        Students s3 = new Students(11, "imon",3.60f);
        Students s4 = new Students(14, "asik" , 3.40f);
        Students s5 = new Students(14, "asik" , 3.40f);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);


        set.forEach(System.out::println);
       // set.remove(0);
        //System.out.println(set);
    }
}
