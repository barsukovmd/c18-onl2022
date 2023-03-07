package squad.people;

import squad.Archer;
import squad.Warrior;
import squad.WarriorType;
import squad.Wizard;

public class PeopleSquadFactory implements WarriorType {
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
