public class Unit1Task2 {
    public static void main(String[] args) {
        int a= 7;
        int b=8;
        int c=13;
        if(a>b+c){
            System.out.println("Такой треугольник не существует");
        }else if(b>a+c){
            System.out.println("Такой треугольник не существует");
        }else if(c>a+b){
            System.out.println("Такой треугольник не существует");
        }else{
            System.out.println("Такой треугольник существует");
        }
    }
}
