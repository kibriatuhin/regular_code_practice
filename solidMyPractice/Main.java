package solidMyPractice;


public class Main {
    public static void main(String[] args) {
        int x = 7;
        int y = x;
        x = 2;
        System.out.println(x + " " + y);
    }
}
class Person{

    String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +

                ", name='" + name + '\'' +
                '}';
    }
}
class STudent extends  Person{

    int id;
    public STudent(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public String  toString() {
        return "STudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p = new STudent("tuhin ",10);
        System.out.println(p);
    }
}
