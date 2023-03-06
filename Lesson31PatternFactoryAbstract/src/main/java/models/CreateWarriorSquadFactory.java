package models;

public interface CreateWarriorSquadFactory {
    ArcherImpl createArcher();

    WarriorImpl createWarrior();

    WizardImpl createWizard();
}
