package Unit11.Task2;

public class TextFormater {

    public static int numberOfWords(String str) {
        String[] mass = str.trim().split("[^A-zА-я]+");
        return mass.length;

    }

    public static boolean presenceOfPalindrome(String str) {
        boolean is = true;
        String[] mass = str.trim().split("[^A-zА-я]+");

        for (int i = 0; i < mass.length; i++) {
            String s = new StringBuilder(mass[i]).reverse().toString();

            if (mass[i].length() > 3 && mass[i].equals(s)) {
                is = true;
                break;
            } else {
                is = false;
            }
        }
        return is;
    }


}
