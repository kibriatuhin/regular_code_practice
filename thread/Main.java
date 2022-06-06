package thread;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
           for (int i=0 ; i<7 ; i++){
               try {
                   System.out.println(Thread.currentThread().getName() + " : " + i);
                   Thread.sleep(1000);
               }catch (Exception e){
                   e.printStackTrace();
               }

           }
        });
       // Runtime.getRuntime().addShutdownHook(t1);
       // t1.join(3000);
        t1.setDaemon(true);
        for (int i=8 ; i<10 ; i++){
            try {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        t1.start();

    }
}

class  Practice44{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int c =(int) sc.next().charAt(0);
        System.out.println(c);
    }
}
