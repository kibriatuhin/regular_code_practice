package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      List<Employee> list = Arrays.asList(
        new Employee(1,"Tuhin",10000l,'M',new String[]{"01787342877","01723113788"}),
        new Employee(2,"tamim",3000l,'M',new String[]{"01787342877","01723113788"}),
        new Employee(3,"toma",12000l,'F',new String[]{"01787342877","01723113788"}),
        new Employee(4,"Tethye",14000l,'F',new String[]{"01787342877","01723113788"})
      );


        list.stream().filter(e -> e.getGender() == 'M').flatMap(e -> Stream.of(e.getPhone())).forEach(System.out::println);

    }
}

class  Employee{
    private int id;
    private  String name;
    private Long salary;
    private  char gender;
    private  String[] phone;

    public Employee(int id, String name, Long salary, char gender, String[] phone) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.phone = phone;
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

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String[] getPhone() {
        return phone;
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", phone=" + Arrays.toString(phone) +
                '}';
    }
}

class  Test{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,2,3,4,5);
        list.stream().distinct().forEach(System.out::println);
    }
}