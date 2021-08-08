package Unit9.Task2;

public class Task2 {
    public static void main(String[] args) {
        String str = "miadfhgldcknveoruhvonkdoae";
        System.out.println(str);
        StringBuffer stringBuffer = new StringBuffer(str);
        char a = stringBuffer.charAt(0);
        char b = stringBuffer.charAt(3);
        char [] mass = str.toCharArray();
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]==b){
                stringBuffer.deleteCharAt(i);
                stringBuffer.insert(i,a);
            }
        }
        System.out.println(stringBuffer);
    }
}
