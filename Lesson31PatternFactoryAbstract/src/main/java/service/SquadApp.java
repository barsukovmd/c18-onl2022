package service;

import models.squad.WarriorTypeFactory;
import models.squad.elf.ElfSquadFactory;
import models.squad.ork.OrkSquadFactory;
import models.squad.people.PeopleSquadFactory;

public class SquadApp {
    public static void main(String[] args) {
        WarriorTypeFactory elfSquad = new ElfSquadFactory();
        elfSquad.createArcher().getWeapon();
        elfSquad.createWarrior().getWeapon();
        elfSquad.createWarrior();
        WarriorTypeFactory orkSquad = new OrkSquadFactory();
        orkSquad.createWarrior().getWeapon();
        orkSquad.createArcher().getWeapon();
        orkSquad.createWizard().getWeapon();
        WarriorTypeFactory peopleSquad = new PeopleSquadFactory();
        peopleSquad.createWizard().getWeapon();
        peopleSquad.createArcher().getWeapon();
        peopleSquad.createWarrior().getWeapon();
    }
}
