package designPattern;

import java.util.ArrayList;
import java.util.List;

interface Department{
    void printDepartmentName();
}

class  ICTDepartment implements Department{

    private  int id;
    private String name;

    public ICTDepartment(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getName());
    }
}
class CSEDepartment implements Department{

    private  int id;
    private String name;

    public CSEDepartment(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getName());
    }
}

class  HeadDepartment implements Department{

    private Integer id;
   private String name ;
   private List<Department> childDepartments ;


   HeadDepartment(Integer id, String name){
       this.id = id;
       this.name = name;
       this.childDepartments = new ArrayList<>();
   }


   public void addDepartment(Department department){
       childDepartments.add(department);
   }
   public void removeDepartment(Department department){
       childDepartments.remove(department);
   }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }
}

public class CompositeDesignPattern {
    public static void main(String[] args) {
        Department ict = new ICTDepartment(1,"ICTDEPARTMENT");
        Department cse = new CSEDepartment(2,"CSEDEPARTMENT");
        Department head = new HeadDepartment(100,"HEAD");
        ((HeadDepartment) head).addDepartment(ict);
        ((HeadDepartment) head).addDepartment(cse);
        head.printDepartmentName();
    }
}
