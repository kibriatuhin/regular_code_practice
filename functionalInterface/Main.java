package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Tuhin", 70));
        studentList.add(new Student(2, "Tethye", 80));
        studentList.add(new Student(3, "Tamim", 60));
        studentList.add(new Student(5, "Toma", 50));

        Function<Student, String> function = (e) -> {
            int mark = e.getMark();

            if (mark >= 50 && mark<60) return "C";
            else if (mark >= 60 && mark<70) return "B";
            else if (mark >= 70 && mark<80) return "A";
            else if (mark >= 80 && mark<100) return "A+";
            else
                return "F";

        };

        for (Student student : studentList){
            System.out.println(student.getId() + " " + student.getName() + " " + student.getMark() + " " + function.apply(student));
        }




    }
}
/* List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Tuhin",10500, "male"));
        employees.add(new Employee(2,"Tethye",20000, "female"));
        employees.add(new Employee(3,"Toma",9000, "female"));
        employees.add(new Employee(4,"Shahin",30000, "male"));
        employees.add(new Employee(5,"Ashik",15000, "male"));

        Predicate<Employee> predicate = e -> e.getSalary()>10000 && e.getGender()== "male";

        for (Employee employee: employees){
            if (predicate.test(employee)){
                System.out.println(employee);
            }
        }*/