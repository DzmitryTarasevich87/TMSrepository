package Unit11.Task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        TextFormater textFormater = new TextFormater();
        try (BufferedReader br = new BufferedReader(new FileReader("Unit1/src/Unit11/Task2/task2_in.txt"))) {
            String str = "";
            String a;
            while ((a = br.readLine()) != null) {
                str +=a;
            }
            String []arr = str.split("\\.");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("Unit1/src/Unit11/Task2/task2_out.txt"))) {
                for (int i = 0; i < arr.length; i++) {
                    if(textFormater.presenceOfPalindrome(arr[i])){
                        bw.write(arr[i]);
                    }else if (textFormater.numberOfWords(arr[i])>2 && textFormater.numberOfWords(arr[i])< 6){
                        bw.write(arr[i]+". ");
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
