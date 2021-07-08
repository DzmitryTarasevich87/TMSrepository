public class Unit1Task7 {
    public static void main(String[] args) {
        int a =76;
        if(((a%100!=11)&(a%10==1))){
            System.out.println(a+" программист");
        }else if (((a%10==2)|(a%10==3)|(a%10==4))&((a%100!=12)&(a%100!=13)&(a%100!=14))){
            System.out.println(a+" программиста");
        }else{
            System.out.println(a+" программистов");
        }
    }
}
