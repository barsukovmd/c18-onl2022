package models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ElfSquadImpl implements CreateWarriorSquadFactory {

    @Override
    public ArcherImpl createArcher() {
        System.out.println("Elf Archer using arch");
        return new ArcherImpl();
    }

    @Override
    public WarriorImpl createWarrior() {
        System.out.println("Elf Warrior using sworn");
        return new WarriorImpl();
    }

    @Override
    public WizardImpl createWizard() {
        System.out.println("Elf Wizard using magic");
        return new WizardImpl();
    }
}
