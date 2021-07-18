package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("Введите положительное число");
            a = sc.nextInt();
        } while (a <= 0);
        int mass[] = new int[a];
        Random rnd = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(15);
            System.out.print(mass[i] + " ");
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < mass.length; i++) {
            if (i <= mass.length / 2) {
                sum1 += mass[i];
            } else {
                sum2 += mass[i];
            }
        }
        System.out.println();
        if (sum1 > sum2) {
            System.out.println("Сумма первой половины больше суммы второй половины массива");
        } else if (sum2 > sum1) {
            System.out.println("Сумма второй половины больше суммы первой половины массива");
        } else {
            System.out.println("Суммы первой и второй половин массива равны");
        }
    }
}

