package models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PeopleSquad implements CreateWarriorSquadFactoryImpl {
    @Override
    public Archer createArcher() {
        return new Archer();
    }

    @Override
    public Warrior createWarrior() {
        System.out.println("Warrior using sworn");
        return new Warrior();
    }

    @Override
    public Wizard createWizard() {
        System.out.println("Wizard using magic");
        return new Wizard();
    }
}
