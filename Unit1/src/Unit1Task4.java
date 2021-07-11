public class Unit1Task4 {
    public static void main(String[] args) {
        int a = -3;
        int b = 0;
        int c = 3;
        int count = 0;
        if (a >= 0) {
            count++;
        } if (b >= 0) {
            count++;
        }  if (c >= 0) {
            count++;
        }
        System.out.println("Количество положительных чисел - " + count);
    }
}
