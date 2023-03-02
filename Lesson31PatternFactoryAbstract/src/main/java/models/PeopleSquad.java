package models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PeopleSquad implements CreateWarriorImpl {
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
