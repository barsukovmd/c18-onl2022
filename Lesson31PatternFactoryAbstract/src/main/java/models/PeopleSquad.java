package models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PeopleSquad implements CreateWarriorFactoryImpl {
    @Override
    public Archer createArcher() {
        return new Archer();
    }

    @Override
    public Warrior createWarrior() {
        System.out.println("Warrior from People");
        return new Warrior();
    }

    @Override
    public Wizard createWizard() {
        System.out.println("Wizard from People");
        return new Wizard();
    }
}
