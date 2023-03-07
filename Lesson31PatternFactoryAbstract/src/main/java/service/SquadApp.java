package service;

import squad.WarriorTypeFactory;
import squad.elf.ElfSquadFactory;
import squad.ork.OrkSquadFactory;
import squad.people.PeopleSquadFactory;

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
