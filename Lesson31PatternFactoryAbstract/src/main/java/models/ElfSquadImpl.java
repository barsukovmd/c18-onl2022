package models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ElfSquadImpl implements CreateWarriorSquadFactory {

    @Override
    public ArcherImpl createArcher() {
        return new ArcherImpl();
    }

    @Override
    public WarriorImpl createWarrior() {
        return new WarriorImpl();
    }

    @Override
    public WizardImpl createWizard() {
        return new WizardImpl();
    }
}
