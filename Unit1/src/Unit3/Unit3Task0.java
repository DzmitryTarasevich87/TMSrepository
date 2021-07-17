package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] mass = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            mass[i] = rnd.nextInt(100);
            System.out.print(mass[i] + " ");
        }
    }
}
