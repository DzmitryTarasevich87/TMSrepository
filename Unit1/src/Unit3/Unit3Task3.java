package Unit3;

import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        Random rnd = new Random();
        int evenCount = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(99);
            if (mass[i] % 2 == 0 && mass[i] != 0) {
                evenCount++;
            }
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println(evenCount);
    }
}
