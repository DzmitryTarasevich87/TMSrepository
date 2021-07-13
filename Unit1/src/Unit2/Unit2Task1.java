package Unit2;

public class Unit2Task1 {
    public static void main(String[] args) {
        int day = 7 ;
        double distance = 10;
        double weekDistance = 10;
        for (int i =1; i< day;i++){
            distance+=distance*0.1;
            weekDistance+=distance;
        }
        System.out.println(weekDistance);
    }
}

