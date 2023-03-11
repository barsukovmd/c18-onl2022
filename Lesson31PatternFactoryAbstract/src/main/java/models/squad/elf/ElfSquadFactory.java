package models.squad.elf;

import models.squad.Archer;
import models.squad.Warrior;
import models.squad.WarriorTypeFactory;
import models.squad.Wizard;

public class ElfSquadFactory implements WarriorTypeFactory {
    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Wizard createWizard() {
        return new ElfWizard();
    }
}
