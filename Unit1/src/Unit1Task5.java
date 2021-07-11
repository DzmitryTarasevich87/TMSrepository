public class Unit1Task5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        int c = -3;
        int countP = 0;
        int countN = 0;
        if (a >= 0) {
            countP++;
        } else {
            countN++;
        }
        if (b >= 0) {
            countP++;
        } else {
            countN++;
        }
        if (c >= 0) {
            countP++;
        } else {
            countN++;
        }
        System.out.println("Количество положительных чисел - " + countP + " Количество отрицательных чисел - " + countN);
    }
}
