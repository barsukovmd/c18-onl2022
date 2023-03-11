package models.squad;

public interface WarriorTypeFactory {
    Archer createArcher();

    Warrior createWarrior();

    Wizard createWizard();

}
