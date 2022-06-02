package concurrency;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;

public class Lecture2 {
    public static void main(String[] args) {
        //atomicBoolean
       /* AtomicBoolean atomicBoolean = new AtomicBoolean(false);

       // atomicBoolean.compareAndSet(true,true);
        boolean b = atomicBoolean.getAndSet(true);

        System.out.println(atomicBoolean.get() + " boolean b : " + b) ;*/

       //atomicInteger
        AtomicInteger atomicInteger = new AtomicInteger(5);
         //int b = atomicInteger.incrementAndGet();
        // int b = atomicInteger.getAndIncrement();
         int b = atomicInteger.accumulateAndGet(2, new IntBinaryOperator() {
             @Override
             public int applyAsInt(int left, int right) {
                 System.out.println("left: " + left + " right : " + right);
                 return left + right;
             }
         });
        System.out.println(b);
        System.out.println(atomicInteger);


    }
}
