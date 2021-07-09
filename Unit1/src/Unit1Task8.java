import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit1Task8 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите первое число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число");
        int b = Integer.parseInt(reader.readLine());
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("Числа равны");
        }
    }
}
