import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit1Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите любое число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long a = Integer.parseInt(reader.readLine());
        if (a > -10 && a < 10) {
            if (a >= 0) {
                System.out.println("Число положительное, однозначное");
            } else {
                System.out.println("Число отрицательное, однозначное");
            }
        } else if (a > -100 && a < 100) {
            if (a >= 0) {
                System.out.println("Число положительное, двухзначноезначное");
            } else {
                System.out.println("Число отрицательное, двухзначноезначное");
            }
        } else if (a > -1000 && a < 1000) {
            if (a >= 0) {
                System.out.println("Число положительное, трехзначноезначное");
            } else {
                System.out.println("Число отрицательное, трехзначноезначное");
            }
        } else {
            System.out.println("Это многозначное число");
        }
    }
}
