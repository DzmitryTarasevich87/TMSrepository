package Unit3;

import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {
        int[] mass = new int[4];
        Random rnd = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(10);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        boolean isStrictUp = true;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < mass[i - 1]) {
                isStrictUp = false;
                break;
            }
        }
        if (isStrictUp) {
            System.out.println("Массив является строго возростающей последовательностью");
        } else {
            System.out.println("Массив не является строго возростающей последовательностью");
        }
    }
}
