package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);


    }
}

class StudentTest {
    public static boolean isFilterStudent(Student student) {
        return student.getCgpa() > 3.50f;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Golam Kibria Tuhin", 3.85f, "Male"));
        students.add(new Student(103, "Tethye", 3.55f, "Female"));
        students.add(new Student(105, "Asikur", 3.30f, "Male"));
        students.add(new Student(102, "Toma", 3.10f, "Female"));
        students.add(new Student(104, "Imon", 3.60f, "Male"));
        students.add(new Student(107, "Nova", 3.39f, "Female"));

        students.stream().filter(StudentTest::isFilterStudent).map(Student::getName).forEach(System.out::println);

    }
}

class Student {
    private int id;
    private String name;
    private float cgpa;
    private String gender;

    public Student(int id, String name, float cgpa, String gender) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa='" + cgpa + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class TestDeveloper {
    public static void main(String[] args) {
        List<Developer> team = new ArrayList<>();

        Developer tuhin = new Developer("Developer x");
        tuhin.add("html");
        tuhin.add("css");
        tuhin.add("bootstrap");
        Developer tuhin2 = new Developer("Developer x");
        tuhin2.add("java");
        tuhin2.add("spring boot");

        team.add(tuhin);
        team.add(tuhin2);
        List<String> list = team.stream().map(developer -> developer.getLanguages()).flatMap(lan -> lan.stream()).collect(Collectors.toList());
        System.out.println(list);


    }
}

class Developer {
    private String name;
    private Set<String> languages;

    public Developer(String name) {
        this.name = name;
        this.languages = new HashSet<>();
    }

    public void add(String language) {
        this.languages.add(language);
    }

    public Set<String> getLanguages() {
        return languages;
    }
}


class Practice {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 2, 4, 3};
       int sum = Arrays.stream(array).reduce(0,(a,b)-> a+b);
        System.out.println(sum);
    }
}

enum Sex {
    MALE, FEMALE
}

class Person {
    private int age;
    private String name;
    private Sex sex;

    public Person(int age, String name, Sex sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}

class PersonTest {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person(15, "Sayeem", Sex.MALE), new Person(12, "Tamanna", Sex.FEMALE)
                , new Person(23, "Eram", Sex.MALE),
                new Person(25, "Tuhin", Sex.MALE),
                new Person(20, "Rifat", Sex.MALE),
                new Person(24, "Tethye", Sex.FEMALE), new Person(10, "Toya", Sex.FEMALE));
       /* people.stream().sorted((p1,p2)-> {
            if (p1.getAge() > p2.getAge())
                return 1;
            else if (p1.getAge()< p2.getAge()) {
                return -1;
            }else {
                return p1.getName().compareTo(p2.getName());
            }
        }).forEach(System.out::println);*/
      /* Optional<Person> person = people.stream().min(Comparator.comparing(Person::getAge));
       person.ifPresent(System.out::println);*/


    }
}


