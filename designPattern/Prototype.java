package designPattern;

import java.util.Arrays;

class Course{
    private int cid;
    private String[] courseName;



    public Course(int cid, String[] courseName) {
        this.cid = cid;
        this.courseName = courseName;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String[] getCourseName() {
        return courseName;
    }

    public void setCourseName(String[] courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", courseName=" + Arrays.toString(courseName) +
                '}';
    }
}

class Student{
   private   int id;
   private String studentName;

   private Course course;

    public Student(int id, String studentName, Course course) {
        this.id = id;
        this.studentName = studentName;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", course=" + course +
                '}';
    }
}

interface StudentProtoType{
    Studentt copy();
}

class Studentt implements StudentProtoType{
    private int id;
    private String name;
    private float cgpa;
    private String phone;
    private String dept;
    private String University;
    public Studentt(){

    }
    public Studentt(String dept, String university) {
        this.dept = dept;
        University = university;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", phone='" + phone + '\'' +
                ", dept='" + dept + '\'' +
                ", University='" + University + '\'' +
                '}';
    }

    @Override
    public Studentt copy() {
        return new Studentt(this.dept,this.University);
    }
}
public class Prototype implements Cloneable{
    public static void main(String[] args) {
      /*  Course course = new Course(2, new String[]{"tuhin", "tamim"});
        Student ob = new Student(101,"GOlam",course);

        System.out.println(ob);*/

    }
}
class Student2{
    private int id;
    private String name;
    private float cgpa;
    private String phone;
    private String dept;
    private String University;

    private Student2(int id, String name, float cgpa, String phone, String dept, String university) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.phone = phone;
        this.dept = dept;
        University = university;
    }



    static class Builder{
        private  int id;
        private String name;
        private float cgpa;
        private String phone;
        private String dept;
        private String University;

        public Builder id(int id){
            this.id = id;
            return  this;
        }
        public  Builder name(String name){
            this.name = name;
            return  this;
        }
        public  Builder cgpa(float cgpa){
            this.cgpa = cgpa;
            return  this;
        }
        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder dept(String dept){
            this.dept = dept;
            return this;
        }
        public Builder University(String university){
            this.University = university;
            return  this;
        }

        public Student2 build(){
            return new Student2(id,name,cgpa,phone,dept,University);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", cgpa=" + cgpa +
                    ", phone='" + phone + '\'' +
                    ", dept='" + dept + '\'' +
                    ", University='" + University + '\'' +
                    '}';
        }
    }
}

class Main{
    public static void main(String[] args) {
        Student2.Builder ob = new Student2.Builder();
        ob.cgpa(2.2f).dept("MBSTU").build();
        System.out.println(ob);
    }
}
