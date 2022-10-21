package designPattern;


class StudentNew{
    private int id;
    private String name;
    private float cgpa;
    private String phone;
    private String dept;
    private String University;

    public StudentNew(int id, String name, float cgpa, String phone, String dept, String university) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.phone = phone;
        this.dept = dept;
        University = university;
    }


    static class  Builder{
        private int id;
        private String name;
        private float cgpa;
        private String phone;
        private String dept;
        private String University;

        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder cgpa(float cgpa){
            this.cgpa = cgpa;
            return this;
        }
        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder dept(String dept){
            this.dept = dept;
            return this;
        }

        public Builder university(String University){
            this.University = University;
            return this;
        }

        public StudentNew build(){
            return new StudentNew(id,name,cgpa,phone,dept,University);
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

public class BuilderDesignPattern {
    public static void main(String[] args) {
        StudentNew.Builder ob = new StudentNew.Builder();
      StudentNew ob1 =  ob.dept("ICT").university("MBSTU").build();
        System.out.println(ob1);

    }
}
