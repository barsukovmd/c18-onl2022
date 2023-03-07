package models.squad.people;

import models.squad.Archer;
import models.squad.Warrior;
import models.squad.WarriorTypeFactory;
import models.squad.Wizard;

public class PeopleSquadFactory implements WarriorTypeFactory {
    @Override
    public Archer createArcher() {
        return new PeopleArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new PeopleWarrior();
    }

    @Override
    public Wizard createWizard() {
        return new PeopleWizard();
    }
}
