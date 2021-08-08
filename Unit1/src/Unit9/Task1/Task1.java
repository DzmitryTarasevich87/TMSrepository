package Unit9.Task1;

public class Task1 {
    public static void main(String[] args) {
        String str = "fmgbaierpgnmkdl;mcvlir;makdl;m";
        System.out.println(str);
        char A = 'a';
        char B = 'k';

        char[] mass = str.toCharArray();
        int first = 0;
        int last = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]==A){
                first = i;
                break;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]==B){
                last = i;
            }
        }

        System.out.println(str.substring(first, last));
        System.out.println(str);
    }
}
