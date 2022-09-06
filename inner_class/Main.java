package inner_class;

public class Main {
    public static void main(String[] args) {

    }
}

class Outer{
    class Inner{
       void innerMethod(){
           System.out.println("innerMethod");
       }
    }

   static void  innerAccess(){
       final   int n =10;
        class Inner{
            void m(){
                System.out.println(n);
            }
        }
        Inner inner  = new Inner();
        inner.m();
    }

    public static void main(String[] args) {
        //approach 1
        /*Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.innerMethod();*/

        //approach 2
       /* Outer.Inner inner = new Outer().new Inner();
        inner.innerMethod();*/

        //aproach 3
        //new Outer().new Inner().innerMethod();

        Outer ob = new Outer();
        ob.innerAccess();
    }
}

class Popcorn{
   public void test(){
        System.out.println("Salty");
    }
}
class PopcornMain{
    public static void main(String[] args) {
        Popcorn popcorn = new Popcorn(){
            @Override
            public void test(){
                System.out.println("tasty");
            }
        };
        popcorn.test();
    }
}

