package Unit5;

import java.util.Random;
import java.util.Scanner;

public class Unit5Task1 {
    public static void main(String[] args) {
//        Computer comp = new Computer(2);
//        comp.info();
//        comp.off();
//        comp.on();
//        comp.on();
//        comp.off();
//        comp.off();
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

    public Computer(int deathResource) {
        this.deathResource = deathResource;
    }

    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    boolean condition = true;

    void on() {
        if (deathResource > 0 && condition) {
            int a = rnd.nextInt(2);
            int b;
            do {
                System.out.println("Введите 1 или 0 для включения");
                b = sc.nextInt();
            } while (b >= 2 || b < 0);

            if (a == b) {
                System.out.println("комп включен");
                condition = false;
            } else {
                System.out.println("критическая ошибка - железу конец");
                deathResource = 0;
            }
        } else {
            System.out.println("Железо свое отработало(");
            deathResource = 0;
        }
    }


    void off() {

        if (deathResource > 0 && !condition) {
            int a = rnd.nextInt(2);
            int b = sc.nextInt();
            do {
                System.out.println("Введите 1 или 0 для выключения");
                b = sc.nextInt();
            } while (b >= 2 || b < 0);
            if (a == b) {
                System.out.println("комп выключен");
                deathResource--;
                condition = true;
            } else {
                System.out.println("не удалось выключить");
            }
        } else {
            System.out.println("комп выключен");
        }
    }
}