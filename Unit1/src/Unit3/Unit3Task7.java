package Unit3;

import java.util.Random;

public class Unit3Task7 {
    public static void main(String[] args) {
        int[] mass = new int[12];
        Random rnd = new Random();
        int number = 0;
        int index = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(15);
            if(number<=mass[i]){
                number=mass[i];
                index =i;
            }
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("last index of max mass number - "+index);
    }
}
