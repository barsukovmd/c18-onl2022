package homework.robot;

import homework.robot.hands.SamsungHands;
import homework.robot.hands.SonyHands;
import homework.robot.hands.ToshibaHands;
import homework.robot.heads.SamsungHeads;
import homework.robot.heads.SonyHeads;
import homework.robot.legs.SamsungLegs;
import homework.robot.legs.SonyLegs;
import homework.robot.legs.ToshibaLegs;

public class Main {
    /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например, у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
    public static void main(String[] args) {
        Robot[] robot = new Robot[3];
        robot[0] = new Robot(new SamsungLegs(150), (new SonyHeads(200)), new ToshibaHands(150));
        robot[0].action();
        int x = robot[0].getPrice();
        System.out.println("Robot 1 price is " + x);
        System.out.println("!!!");
        robot[1] = new Robot(new ToshibaLegs(200), (new SamsungHeads(320)), new SamsungHands(380));
        int y = robot[1].getPrice();
        System.out.println("Robot 2 price is " + y);
        robot[1].action();
        System.out.println("!!!");
        robot[2] = new Robot(new SonyLegs(330), new SonyHeads(210), new SonyHands(280));
        int z = robot[2].getPrice();
        System.out.println("Robot 3 price is " + z);
        robot[2].action();
        System.out.println("!!!");
        int expensiveRobot = robot[2].getExpensiveRobot(robot);
        System.out.println("Most expensive robot is " + expensiveRobot);
    }
}
