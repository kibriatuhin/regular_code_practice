package concurrency;

public class Lecture1 {
    static  int v = 10;
    static ThreadLocal<Integer> local = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return 10;
        }
    };
    static  void fun(){
       // v = v+5;
        int v  = local.get() + 5;
        local.set(v);
    }

    //Runnable
    public static void main(String[] args) throws InterruptedException {
        //Lecture1 ob = new Lecture1();
        Thread t1 = new Thread(()->{
           try {
               fun();
               Thread.sleep(10);
               fun();
               Thread.sleep(10);
               System.out.println("From t1 : " + local.get());
           }catch (Exception e){
               e.printStackTrace();
           }
        });

        Thread t2 = new Thread(()->{
            try {
                fun();
                Thread.sleep(10);
                fun();
                Thread.sleep(10);
                fun();
                Thread.sleep(10);
                fun();
                Thread.sleep(10);
                System.out.println("From t1 : " + local.get());
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        t1.start();
        //Thread.sleep(1000);
        t2.start();
    }
}
