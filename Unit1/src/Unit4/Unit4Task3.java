package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
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
        int mainDiagonal = 1;
        int sideDiagonal = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    mainDiagonal *= matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j == matrix.length - 1) {
                    sideDiagonal *= matrix[i][j];
                }
            }
        }
        if (mainDiagonal > sideDiagonal) {
            System.out.println("Произведение чисел главной диагонали больше");
        } else if (mainDiagonal < sideDiagonal) {
            System.out.println("Произведение чисел побочной диагонали больше");
        } else {
            System.out.println("Произведение чисел диагоналей равно");
        }

    }
}
