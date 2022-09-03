package solid;


import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.ArrayList;
import java.util.List;
class Students implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> list  = new ArrayList<>();
        for (String s : this.getStudents() ){
            list.add(s);
        }
        return new Students(list);

    }

    private List<String> students;

    public List<String> getStudents() {
        return students;
    }

    public Students() {
        students = new ArrayList<>();
    }

    public void load(){
        students.add("tuihin");
        students.add("tamim");
        students.add("tanvir");
        students.add("toma");
    }

    public Students(List<String> students) {
        this.students = students;
    }
}




public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Students ob = new Students();
        ob.load();
        System.out.println(ob);
        Students ob1 =(Students) ob.clone() ;
        System.out.println(ob1);
        List<String> strings =  ob1.getStudents();
        System.out.println(strings);

    }
}


