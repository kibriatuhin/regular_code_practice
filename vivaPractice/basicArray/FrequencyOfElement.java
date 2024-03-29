package vivaPractice.basicArray;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    static void frequencyOfElement(int[] array){
        boolean[] visitor = new boolean[array.length];
        Arrays.fill(visitor,false);
        for (int i=0 ; i<array.length ; i++){
            if (visitor[i]==true){
                continue;
            }
            int count = 1;
            for (int j=i+1 ; j<array.length ; j++){
                if(array[i]==array[j])
                {
                    visitor[j] = true;
                    count++;
                }
            }
            System.out.println(array[i] + " " + count);
        }
    }
    public static void main(String[] args) {
        frequencyOfElement(new int[]{1,2,2,3,4,1,3});
    }
}
class CountFrequency{

    static  void countFreq(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0 ; i<array.length ; i++){
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i] , 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet() ){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

    public static void main(String[] args) {
        countFreq(new int[]{1,2,2,3,4,1,3});
    }
}

class Student{
    public void getAddress(){
        System.out.println("address");
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student ob = new Student(){
          @Override
          public void getAddress(){
              System.out.println("annonymous inner class address");
          }
        };

        ob.getAddress();
    }
}


class MyRunnableTest{
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0 ;i<5 ; i++){
                    System.out.println(i);
                }
            }
        });
        t1.start();
        for (int i=0 ;i< 10 ; i++){
            System.out.println(i);
        }
    }
}