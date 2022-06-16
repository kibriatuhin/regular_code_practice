package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        /*
        File f = new File("file/rose2.jpg");
        BufferedImage img = ImageIO.read(f);

        System.out.println(img);

        int r = img.getWidth();
        int c = img.getHeight();

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                Color color = new Color(img.getRGB(i, j));
                if (insideRange(color)) {
                    img.setRGB(i, j, Color.RED.getRGB());
                }
            }
        }
        ImageIO.write(img, "jpg", new File("file/converted_img.jpg"));
        */



        Thread.currentThread().getThreadGroup().getParent().list();




    }

    static void fun1() throws InterruptedException {
        for (int i=0; i<10; i++) {
            System.out.println("value :: " + i);
            Thread.sleep(10);
        }
    }

    static void fun2() throws InterruptedException {
        for (int i=0; i<10; i++) {
            System.out.println("count :: " + i);
            Thread.sleep(10);
        }
    }

    static boolean insideRange(Color color) {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        return r >= 150 && r <=255 && g >= 150 && g <=255 && b >= 150 && b <=255;
    }
}
