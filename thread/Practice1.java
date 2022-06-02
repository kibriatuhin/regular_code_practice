package thread;

class A{
    public synchronized void m(){
        //System.out.println("Main thread :" + getState());
        for (int i=0 ; i<5 ; i++){
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
    public synchronized   void m2(){
        for (int i=0 ; i<5 ; i++){
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        A ob = new A();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
               ob.m();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ob.m2();
            }
        });
        Thread.sleep(1000);
        System.out.println("Main thread :" + t2.getState());
        System.out.println("Main thread :" + t1.getState());

        t1.start();
        t2.start();



    }


}
