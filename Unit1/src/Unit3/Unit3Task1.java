package Unit3;

public class Unit3Task1 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (i+1)*2;
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}
