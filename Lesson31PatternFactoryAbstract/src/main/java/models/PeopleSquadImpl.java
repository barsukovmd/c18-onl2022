package models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PeopleSquadImpl implements CreateWarriorSquadFactory {
    @Override
    public ArcherImpl createArcher() {
        System.out.println("People Archer using arch");
        return new ArcherImpl();
    }

    @Override
    public WarriorImpl createWarrior() {
        System.out.println("People Warrior using sworn");
        return new WarriorImpl();
    }

    @Override
    public WizardImpl createWizard() {
        System.out.println("People Wizard using magic");
        return new WizardImpl();
    }
}
