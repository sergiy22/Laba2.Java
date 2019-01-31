package com.company;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int a = 8, b = -4;
        double c = 3.12, x = 1.5;
        double k = a * Math.pow(x, -b) + b;
        double y = Math.pow(k, -x + c);
        System.out.printf("Function result y = %.4f \n", y);


       Random random = new Random();
        int a1 = random.nextInt(100);
        int b1 = random.nextInt(100);
        double c1 = random.nextDouble();
        double x1 = random.nextDouble();
        double k1 = a1 * Math.pow(x1, -b1) + b1;
        double y1 = Math.pow(k1, -x1 + c1);
        System.out.printf("Function result y1 = %.4f ", y1);
    }

}
