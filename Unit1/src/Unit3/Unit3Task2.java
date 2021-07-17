package Unit3;

public class Unit3Task2 {
    public static void main(String[] args) {
        int[] mass = new int[50];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 2 * i + 1;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = mass.length-1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
    }
}
