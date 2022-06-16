package anotation;

import anotation.anotation.Component;
import anotation.anotation.IntValue;
import anotation.anotation.StrValidate;
import anotation.anotation.StrValue;
import anotation.processor.RuntimeProcessor;

import java.lang.annotation.*;

@Component
public class Student {
    @IntValue(value = 300,name = "tamim")
    private   int id;
    @StrValue("Karim")
    private String name;

    @StrValidate(min = 7,max = 20,message = "char range for this 'address' field from 7 to 20")
    @StrValue("Sonto")
    private String address;


    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {

            Student ob = new Student();
            RuntimeProcessor.process(ob);
            System.out.println(ob);

    }
}
class Main2{

}