package collections;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;

public class ArrayListPractice {
    public static void main(String[] args) {
      /*  ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("tuhin" , 8,13));
        list.add(new Student("tamim" , 1,3));
        list.add(new Student("tethye" , 2,23));
        list.add(new Student("toma" , 10,29));

        Collections.sort(list);
        System.out.println(list);*/

      ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(5,4,9,2));

       list.set(9,44);
        System.out.println(list);

       // System.out.println(list);
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int roll;
    private int age;

    public Student(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {
        int compareAge = st.getAge();
        return this.age - compareAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", age=" + age +
                '}';
    }
}


