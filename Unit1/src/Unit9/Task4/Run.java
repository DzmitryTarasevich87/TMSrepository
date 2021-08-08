package Unit9.Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Unit9Task4Test");
        File out = new File("Unit9Task4Out");
        PrintWriter print = new PrintWriter(out);
        Scanner sc = new Scanner(file);
        String[] arr = sc.nextLine().split("\\.");

        for (int i = 0; i < arr.length; i++) {
            if (TextFormater.wordsCount(arr[i]) > 2 && TextFormater.wordsCount(arr[i]) < 6) {
                print.println(arr[i]);
            }
            if (TextFormater.palindrome(arr[i])) {
                print.println(arr[i]);
            }
        }
        sc.close();
        print.close();
    }
}

