package models.squad.people;

import models.squad.Warrior;

public class PeopleWarrior extends Warrior {
    @Override
    public void getWeapon() {
        System.out.println("People Warrior using people's sworn");
    }
}
