package thread;

public class PracticeJoin {
    public static void main(String[] args) throws InterruptedException {
        PracticeJoin join = new PracticeJoin();
        Thread t1 = new Thread(()->{
            for (int i=0 ; i<10 ; i++){
                System.out.println(Thread.currentThread().getName() + " -> " +i );
                try {
                    if (i==5){
                        synchronized (join){
                            System.out.println("I am waiting...");
                            join.wait();
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        Thread.sleep(10000);

        synchronized (join){
            join.notify();
        }
    }
}
