package Unit5;

import java.util.Random;
import java.util.Scanner;

public class Unit5Task1 {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.info();
        comp.on();
        comp.off();
    }
}

class Computer {

    String CPU = "AMD RYZEN 5 5600X";
    int deathResource;
    String RAM = "Corsair Vengeance LED";
    String HDD = "Seagate FireCuda";

    void info() {
        System.out.println("CPU - " + CPU + "; RAM - " + RAM + "; HDD - " + HDD);
    }

    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();

    void on() {
        int a = rnd.nextInt(2);
        int b;
        do {
            System.out.println("Введите 1 или 0 для включения");
            b = sc.nextInt();
        } while (b >= 2 || b < 0);

        if (a == b) {
            System.out.println("комп включен");
        } else {
            System.out.println("критическая ошибка - железу конец");
        }
    }


    void off() {
        int a = rnd.nextInt(2);
        int b = sc.nextInt();
        do {
            System.out.println("Введите 1 или 0 для выключения");
            b = sc.nextInt();
        } while (b >= 2 || b < 0);
        if (a == b) {
            System.out.println("комп выключен");
        } else {
            System.out.println("не удалось выключить");
        }
    }
}