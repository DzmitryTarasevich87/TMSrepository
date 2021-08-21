package Unit11.Task1;

import java.io.*;

public class Task1 {



    public static boolean isPolindrome(String str) {
        boolean is;
        StringBuilder stringBuilder = new StringBuilder(str);
        String str1 = stringBuilder.reverse().toString();
        if (str.equals(str1)) {
            is = true;
        } else {
            is = false;
        }
        return is;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Unit1/src/Unit11/Task1/task1_in.txt"))) {
            String s;
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("Unit1/src/Unit11/Task1/task1_out.txt"))) {
                while ((s = br.readLine()) != null) {
                    if (isPolindrome(s)) {
                        bw.write(s + " ");
                    }
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
