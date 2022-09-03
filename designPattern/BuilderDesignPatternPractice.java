package designPattern;

public class BuilderDesignPatternPractice {
    public static void main(String[] args) {
        Student3.Build builder = new Student3.Build();
        Student3 s =  builder.id(10).build();
        System.out.println(s);
    }
}
class Student3{
    private int id;
    private String name;
    private String phone;
    private float cgpa;

    public Student3(int id, String name, String phone, float cgpa) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.cgpa = cgpa;
    }

    static class Build{
        private int id;
        private String name;
        private String phone;
        private float cgpa;

        public Build id(int id){
            this.id = id;
            return this;
        }
        public Build name(String name){
            this.name = name;
            return this;
        }
        public Build id(String phone){
            this.phone = phone;
            return this;
        }

        public Build id(float cgpa){
            this.cgpa = cgpa;
            return this;
        }


        public Student3 build(){
            return new Student3(id,name,phone,cgpa);
        }
    }

    @Override
    public String toString() {
        return "Student3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
