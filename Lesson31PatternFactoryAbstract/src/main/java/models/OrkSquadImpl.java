package models;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class OrkSquadImpl implements CreateWarriorSquadFactory {

    @Override
    public ArcherImpl createArcher() {
        System.out.println("Ork Archer using arch");
        return new ArcherImpl();
    }

    @Override
    public WarriorImpl createWarrior() {
        System.out.println("Ork warrior using sworn");
        return new WarriorImpl();
    }

    @Override
    public WizardImpl createWizard() {
        System.out.println("Ork wizard using magic");
        return new WizardImpl();
    }
}
