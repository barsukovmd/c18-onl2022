package models.squad.ork;

import models.squad.Archer;

public class OrkArcher extends Archer {
    @Override
    public void getWeapon() {
        System.out.println("Ork Archer using ork arch");
    }
}
