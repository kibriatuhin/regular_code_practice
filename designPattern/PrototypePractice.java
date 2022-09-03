package designPattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypePractice {
    public static void main(String[] args) {
        Employees em = new Employees();
        em.load();


    }
}

class Employees implements Cloneable{
    private List<String> empList;

    Employees(){
        empList = new ArrayList<>();
    }
    Employees(List<String> list){
        this.empList = list;
    }
    public void load(){
        empList.add("tuhin");
        empList.add("tamim");
        empList.add("tethye");
        empList.add("toya");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();
        for (String s : this.getEmpList()){
            list.add(s);
        }
        return new Employees(list);
    }
}