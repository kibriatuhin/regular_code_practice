package thread;

public class Practice3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
                for (int i=0 ;i< 10 ; i++){
                    try {
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " : " + i);

                }
        });
        t1.setDaemon(true);
        t1.start();

        //Runtime.getRuntime().addShutdownHook(t1);
        //t1.setDaemon(true);

       // Thread.sleep(2000);
        //t1.join(300);

        for (int i=10 ;i< 15 ; i++){
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);

        }


    }
}

class Student{
    public static synchronized   void  m() throws InterruptedException {
        for (int i=0 ; i< 10 ; i++){
            System.out.println(Thread.currentThread().getName() + "-> " + i);
            Thread.sleep(500);
        }
    }
    public static synchronized    void  m1() throws InterruptedException {
        for (int i=0 ; i< 10 ; i++){
            System.out.println(Thread.currentThread().getName() + "-> " + i);
            Thread.sleep(500);
        }
    }
}

class StudentMain{
    public static void main(String[] args) {
        Student ob = new Student();
        Thread t1 = new Thread(()->{
            try {
                ob.m();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(()->{
            try {
                ob.m1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }
}
