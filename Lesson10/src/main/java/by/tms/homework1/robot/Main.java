package by.tms.homework1.robot;

import by.tms.homework1.robot.hands.SamsungHands;
import by.tms.homework1.robot.hands.SonyHands;
import by.tms.homework1.robot.hands.ToshibaHands;
import by.tms.homework1.robot.heads.SamsungHeads;
import by.tms.homework1.robot.heads.SonyHeads;
import by.tms.homework1.robot.legs.SamsungLegs;
import by.tms.homework1.robot.legs.SonyLegs;
import by.tms.homework1.robot.legs.ToshibaLegs;

public class Main {

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
