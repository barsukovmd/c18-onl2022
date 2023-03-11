package models.squad.people;

import models.squad.Wizard;

public class PeopleWizard extends Wizard {
    @Override
    public void getWeapon() {
        System.out.println("People Wizard using people's magic");
    }
}
