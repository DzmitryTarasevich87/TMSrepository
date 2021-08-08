package Unit9.Task4;

public class TextFormater {
    static int wordsCount(String str) {
        String[] mass = str.split("\\s*(\\s|,|!|\\.)\\s*");// работает совсем не корректно, из-за чего main работает криво, с регулярными выражениями пока без взаимности отношения(((
        return mass.length;
    }

    static boolean palindrome(String str) {
        boolean result = false;
        String[] mass = str.split("\\s*(\\s|,|!|\\.)\\s*");
        for (int i = 0; i < mass.length; i++) {
            StringBuffer stringBuffer = new StringBuffer(mass[i]);
            if (stringBuffer.toString().equals(stringBuffer.reverse().toString())) {
                result = true;
                break;
            }
        }
        return result;
    }
}
