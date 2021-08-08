package Unit9.Task4;

import java.util.Locale;

public class TextFormater {
    static int wordsCount(String str) {
        String[] mass = str.trim().split("[^A-zА-я]+");
        return mass.length;
    }

    static boolean palindrome(String str) {
        boolean result = false;
        String[] mass = str.trim().split("[^A-zА-я]+");
        for (int i = 0; i < mass.length; i++) {
            StringBuffer stringBuffer = new StringBuffer(mass[i].trim().toLowerCase(Locale.ROOT));
            if (stringBuffer.length() > 3 && stringBuffer.toString().equals(stringBuffer.reverse().toString())) {

                result = true;
                break;
            }
        }
        return result;
    }
}
