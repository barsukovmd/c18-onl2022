package models.squad.ork;

import models.squad.Wizard;

public class OrkWizard extends Wizard {
    @Override
    public void getWeapon() {
        System.out.println("Ork Wizard using ork magic");
    }
}
