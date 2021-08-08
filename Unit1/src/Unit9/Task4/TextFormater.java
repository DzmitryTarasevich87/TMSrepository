package Unit9.Task4;

public class TextFormater {
    static int wordsCount(String str) {
        String[] mass = str.split("[A-zА-я]+");// на тестовом сайте работает, а в программе с кодировкой проблемы или с чем то еще , получаются массивы непонятные с пустыми элементами(
        return mass.length;
    }

    static boolean palindrome(String str) {
        boolean result = false;
        String[] mass = str.split("[A-zА-я]+");
        for (int i = 0; i < mass.length; i++) {
            StringBuffer stringBuffer = new StringBuffer(mass[i]);
            if (mass[i].length()>3 && stringBuffer.toString().equals(stringBuffer.reverse().toString())) {
                result = true;
                break;
            }
        }
        return result;
    }
}
