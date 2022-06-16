package thread;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0 ; i<5 ; i++){
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + " : " + i );

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t1.join(3000);
        //System.out.println(t1.getPriority());
        for (int i=0 ; i<5 ; i++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " : " + i );

            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
