package squad.ork;

import squad.*;

public class OrkSquadFactory implements WarriorType {
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
