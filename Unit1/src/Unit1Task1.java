import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.String.valueOf;

public class Unit1Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите любое число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long a = Integer.parseInt(reader.readLine());
        if(a>=0){
            System.out.println("Число положительное "+valueOf(Math.abs(a)).length()+"-значное.");
        }else {
            System.out.println("Чило отрицательное "+valueOf(Math.abs(a)).length()+"-значное.");
        }
    }
}
