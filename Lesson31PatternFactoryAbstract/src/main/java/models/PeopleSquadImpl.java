package models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PeopleSquadImpl implements CreateWarriorSquadFactory {
    @Override
    public ArcherImpl createArcher() {
        return new ArcherImpl();
    }

    @Override
    public WarriorImpl createWarrior() {
        System.out.println("Warrior using sworn");
        return new WarriorImpl();
    }

    @Override
    public WizardImpl createWizard() {
        System.out.println("Wizard using magic");
        return new WizardImpl();
    }
}
