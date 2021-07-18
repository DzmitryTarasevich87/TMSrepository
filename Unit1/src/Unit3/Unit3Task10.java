package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Введите число больше 3");
            n = sc.nextInt();
        } while (n <= 3);
        int mass[] = new int[n];
        Random rnd = new Random();
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(n);
            System.out.print(mass[i] + " ");
            if (mass[i] % 2 == 0 && mass[i] != 0) {
                count++;
            }
        }
        System.out.println();
        int mass2[] = new int[count];
        int j = 0;
        for (int i = 0; i < mass.length; i++) {

            if (mass[i] % 2 == 0 && mass[i] != 0) {
                mass2[j] = mass[i];
                System.out.print(mass2[j] + " ");
                j++;
            }
        }
    }
}

