package models;


public class ElfSquad implements CreateWarriorImpl {

    @Override
    public Archer createArcher() {
        return new Archer();
    }

    @Override
    public Warrior createWarrior() {
        return new Warrior();
    }

    @Override
    public Wizard createWizard() {
        return new Wizard();
    }
}
