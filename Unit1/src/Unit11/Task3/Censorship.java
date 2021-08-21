package Unit11.Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Censorship {


    public static void isCensorship(String[] text, String[] blackList) {
        int count = 0;
        for (int i = 0; i < blackList.length; i++) {
            boolean is = false;
            for (int j = 0; j < text.length; j++) {

                if (stringToWords(text[j], blackList[i])) {
                    is = true;
                    System.out.println(text[j]);
                }
            }
            if (is) {
                count++;
            }
        }
        System.out.println("Найдено " + count + " предложения(ий) не прошедших проверку");

    }

    private static boolean stringToWords(String s, String a) {
        boolean is = false;
        String[] mass = s.trim().split("[^A-zА-я]+");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].toLowerCase(Locale.ROOT).equals(a.toLowerCase(Locale.ROOT))) {
                is = true;
            } else {
                is = false;
            }
        }
        return is;
    }


    public static void main(String[] args) {


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Unit1/src/Unit11/Task3/task3_text.txt"))) {
            try (BufferedReader bufferedReader2 = new BufferedReader(new FileReader("Unit1/src/Unit11/Task3/black_list.txt"))) {
                String str = "";
                String a;

                while ((a = bufferedReader.readLine()) != null) {
                    str += a;
                }
                String[] text = str.split("\\.");


                String str2 = "";
                String a2;

                while ((a2 = bufferedReader2.readLine()) != null) {
                    str2 = str2 + a2 + " ";
                }
                String[] blackList = str2.split(" ");
                isCensorship(text, blackList);

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
