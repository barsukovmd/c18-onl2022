package by.tms.homework1.robot;

import by.tms.homework1.robot.hands.IHand;
import by.tms.homework1.robot.heads.IHead;
import by.tms.homework1.robot.legs.ILeg;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Robot implements IRobot {
    public Robot(ILeg leg, IHead head, IHand hand) {
        this.leg = leg;
        this.head = head;
        this.hand = hand;
    }

    private ILeg leg;
    private IHead head;
    private IHand hand;


    @Override
    public void action() {
        hand.grab();
        head.rotate();
        leg.extend();
    }

    @Override
    public int getPrice() {
        return leg.getPrice() + hand.getPrice() + head.getPrice();
    }

    public int getExpensiveRobot(Robot... robots) {
        int max = 0;
        for (Robot allRobots : robots) {
            if (allRobots.getPrice() > max) {
                max = allRobots.getPrice();
            }
        }
        return max;
    }
}
