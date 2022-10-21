package file;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("abd");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
    }
}
class Practice2{
    public static void main(String[] args) throws IOException {

        File file1  = new File("tuhin","tuhin3.text");
        file1.createNewFile();
    }
}

class Practice3{
    public static void main(String[] args) {
        int count =0 ;
        File file = new File("tuhin");
        String[] s = file.list();
        for (String s1 : s){
            count++;
            System.out.println(s1);
        }
        System.out.println(count);
    }
}

class Practice4{
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("tuhin/tuhin2.text");
        fileWriter.write(100);
        fileWriter.write('\n');
        fileWriter.write("Tuhin Ahmed");
        fileWriter.write('\n');
        char[] ch = {'a','b','c'};
        fileWriter.write(ch);
        fileWriter.flush();
        fileWriter.close();

    }
}
class Practice5{
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("tuhin/tuhin2.text");
       int n =  fileReader.read();
       while (n != -1){
           System.out.println((char) n);
           n = fileReader.read();
       }
    }
}
class Practice6{
    public static void main(String[] args) throws IOException {
        File file = new File("tuhin/tuhin2.text");
        FileReader fileReader = new FileReader(file);
        char[] ch = new char[(char)file.length()];
        fileReader.read(ch);
       for (char ch1 : ch){
           System.out.println(ch1);
       }
    }
}
class Practice7{
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("tuhin/tuhin.text");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(100);
        bufferedWriter.newLine();
        bufferedWriter.write(new char[]{'a','b','c','d'});
        bufferedWriter.newLine();
        bufferedWriter.write("GK tuhin");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
class Practice8{
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("tuhin/tuhin.text");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while (line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }
    }
}
