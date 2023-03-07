package models.squad.ork;

import models.squad.Warrior;

public class OrkWarrior extends Warrior {
    @Override
    public void getWeapon() {
        System.out.println("Ork Warrior using ork sworn");
    }
}
