package Unit3;

import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args) {
        int[] mass1 = new int[5];
        int mass1Average = 0;
        int[] mass2 = new int[5];
        int mass2Average = 0;
        Random rnd = new Random();
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = rnd.nextInt(15);
            mass1Average += mass1[i];
            System.out.print(mass1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = rnd.nextInt(15);
            mass2Average += mass2[i];
            System.out.print(mass2[i] + " ");
        }
        System.out.println();
        if (mass1Average/mass1.length > mass2Average/mass2.length) {
            System.out.println("Среднее арифметическое первого массива больше");
        }
        else if (mass2Average/mass2.length > mass1Average/mass1.length)
        {
            System.out.println("Среднее арифметическое второго массива больше");
        }else{
            System.out.println("Средние арифметические двух массивов равны");
        }
    }
}
