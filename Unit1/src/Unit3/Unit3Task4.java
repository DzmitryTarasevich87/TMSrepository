package Unit3;

import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        int[] mass = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(20);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length ; i++) {
            if (i%2!=0&&i!=0){
                mass[i]=0;
            }
            System.out.print(mass[i]+" ");
        }
    }
}
