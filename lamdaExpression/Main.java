package lamdaExpression;


interface A{
    void sum(int a , int b);
}

public class Main {
    public static void main(String[] args) {
       A a = (d,e)-> System.out.println(d+e);
        a.sum(10,5);

    }
}
