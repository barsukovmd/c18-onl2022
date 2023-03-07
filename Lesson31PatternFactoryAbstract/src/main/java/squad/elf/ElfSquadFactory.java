package squad.elf;

import squad.Archer;
import squad.Warrior;
import squad.WarriorType;
import squad.Wizard;

public class ElfSquadFactory implements WarriorType {
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
