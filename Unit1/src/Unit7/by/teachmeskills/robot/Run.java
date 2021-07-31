package Unit7.by.teachmeskills.robot;

import Unit7.by.teachmeskills.robot.hands.SamsungHand;
import Unit7.by.teachmeskills.robot.hands.SonyHand;
import Unit7.by.teachmeskills.robot.hands.ToshibaHand;
import Unit7.by.teachmeskills.robot.heads.SamsungHead;
import Unit7.by.teachmeskills.robot.heads.SonyHead;
import Unit7.by.teachmeskills.robot.heads.ToshibaHead;
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
        SonyHead sonyHead = new SonyHead(15);
        SonyHand sonyHand = new SonyHand(20);
        SonyLeg sonyLeg = new SonyLeg(25);

        SamsungHead samsungHead = new SamsungHead(12);
        SamsungHand samsungHand = new SamsungHand(23);
        SamsungLeg samsungLeg = new SamsungLeg(31);

        ToshibaHand toshibaHand = new ToshibaHand(9);
        ToshibaHead toshibaHead = new ToshibaHead(11);
        ToshibaLeg toshibaLeg = new ToshibaLeg(14);

        Robot r1 = new Robot(samsungHead, sonyHand, sonyLeg);
        Robot r2 = new Robot(toshibaHead, samsungHand, toshibaLeg);
        Robot r3 = new Robot(sonyHead, sonyHand, sonyLeg);

        r1.action();
        r2.action();
        r3.action();

        if (r1.getPrice() > r2.getPrice() && r1.getPrice() > r3.getPrice()) {
            System.out.println("Most cost r1");
        } else if (r2.getPrice() > r1.getPrice() && r2.getPrice() > r3.getPrice()) {
            System.out.println("Most cost r2");
        } else {
            System.out.println("Most cost r3");
        }
    }
}
