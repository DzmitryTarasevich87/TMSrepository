package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Введите размер матрицы");
            n = sc.nextInt();
        } while (n <= 0);
        int[][] matrix = new int[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rnd.nextInt(50);
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        int sideEvenSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j < matrix.length - 1 && matrix[i][j] % 2 == 0) {
                    sideEvenSum += matrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Сумма четных чисел над побочной диагональю = "+sideEvenSum);
    }
}
