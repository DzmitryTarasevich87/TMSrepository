package Unit9.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Unit9Task3Test");
        File out = new File("Unit9Task3Out");
        PrintWriter print = new PrintWriter(out);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            StringBuffer str = new StringBuffer(sc.nextLine());
            if (str.toString().equals(str.reverse().toString())) {
                print.println(str);
            }
        }
        sc.close();
        print.close();

    }

}

