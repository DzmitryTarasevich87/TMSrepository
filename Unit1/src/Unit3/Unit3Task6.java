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
        if(mass[1]>mass[0]&&mass[2]>mass[1]&&mass[3]>mass[2]){
            System.out.println("Массив является строго возростающей последовательностью");
        }else{
            System.out.println("Массив не является строго возростающей последовательностью");
        }
    }
}
