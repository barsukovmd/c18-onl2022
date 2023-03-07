package models.squad.people;

import models.squad.Archer;

public class PeopleArcher extends Archer {
    @Override
    public void getWeapon() {
        System.out.println("People Archer using people's arch");
    }
}
