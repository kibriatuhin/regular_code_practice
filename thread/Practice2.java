package thread;

public class Practice2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0 ; i<5 ; i++){
                    try {
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + " : " + i );

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        for (int i=0 ; i<5 ; i++){
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " : " + i );

            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
