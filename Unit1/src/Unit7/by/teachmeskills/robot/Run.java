package Unit7.by.teachmeskills.robot;

import Unit7.by.teachmeskills.robot.hands.IHand;
import Unit7.by.teachmeskills.robot.hands.SamsungHand;
import Unit7.by.teachmeskills.robot.hands.SonyHand;
import Unit7.by.teachmeskills.robot.hands.ToshibaHand;
import Unit7.by.teachmeskills.robot.heads.IHead;
import Unit7.by.teachmeskills.robot.heads.SamsungHead;
import Unit7.by.teachmeskills.robot.heads.SonyHead;
import Unit7.by.teachmeskills.robot.heads.ToshibaHead;
import Unit7.by.teachmeskills.robot.legs.ILeg;
import Unit7.by.teachmeskills.robot.legs.SamsungLeg;
import Unit7.by.teachmeskills.robot.legs.SonyLeg;
import Unit7.by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {


    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


        IHead sonyHead = new SonyHead(15);
        IHand sonyHand = new SonyHand(20);
        ILeg sonyLeg = new SonyLeg(25);

        IHead samsungHead = new SamsungHead(12);
        IHand samsungHand = new SamsungHand(23);
        ILeg samsungLeg = new SamsungLeg(31);

        IHand toshibaHand = new ToshibaHand(9);
        IHead toshibaHead = new ToshibaHead(11);
        ILeg toshibaLeg = new ToshibaLeg(14);

        IRobot r1 = new Robot(samsungHead, sonyHand, sonyLeg);
        IRobot r2 = new Robot(toshibaHead, samsungHand, toshibaLeg);
        IRobot r3 = new Robot(sonyHead, sonyHand, sonyLeg);

        r1.action();
        System.out.println(r1.getPrice());
        r2.action();
        System.out.println(r2.getPrice());
        r3.action();
        System.out.println(r3.getPrice());

//        if (r1.getPrice() > r2.getPrice() && r1.getPrice() > r3.getPrice()) {
//            System.out.println("Most cost r1");
//        } else if (r2.getPrice() > r1.getPrice() && r2.getPrice() > r3.getPrice()) {
//            System.out.println("Most cost r2");
//        } else {
//            System.out.println("Most cost r3");
//        }
//        System.out.println(Math.max(r1.getPrice(), Math.max(r2.getPrice(), r3.getPrice())));

        Robot[] mass = new Robot[3];
        mass[0] = (Robot) r1;
        mass[1] = (Robot) r2;
        mass[2] = (Robot) r3;

        int maxCost = 0;

        for (int i = 0; i < mass.length; i++) {
            if (maxCost < mass[i].getPrice()) {
                maxCost = mass[i].getPrice();
            }
        }
        System.out.println("Самый дорогой робот стоит - " + maxCost);
    }
}
