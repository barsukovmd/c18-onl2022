package models;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class OrkSquadImpl implements CreateWarriorSquadFactory {

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
