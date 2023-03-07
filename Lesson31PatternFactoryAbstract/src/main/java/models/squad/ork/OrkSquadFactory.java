package models.squad.ork;

import models.squad.Archer;
import models.squad.Warrior;
import models.squad.WarriorTypeFactory;
import models.squad.Wizard;

public class OrkSquadFactory implements WarriorTypeFactory {
    @Override
    public Archer createArcher() {
        return new OrkArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new OrkWarrior();
    }

    @Override
    public Wizard createWizard() {
        return new OrkWizard();
    }
}
