package Unit3;

import java.util.Random;

public class Unit3Task8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int mass1[] = new int[10];
        int mass2[] = new int[10];
        double mass3[] = new double[10];
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = rnd.nextInt(9);
            System.out.print(mass1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = rnd.nextInt(9);
            System.out.print(mass2[i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < mass3.length; i++) {
            if (mass2[i] != 0) {
                mass3[i] =(double) mass1[i] / mass2[i];
            } else {
                mass3[i] = 0;
            }
            if (mass3[i] % 2 == 1 || mass3[i] % 2 == 0 && mass3[i] != 0) {
                count++;
            }
            System.out.print(mass3[i] + " ");
        }
        System.out.println();
        System.out.println(count);
    }
}
