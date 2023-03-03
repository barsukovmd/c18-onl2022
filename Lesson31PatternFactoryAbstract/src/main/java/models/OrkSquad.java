package models;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class OrkSquad implements CreateWarriorSquadFactoryImpl {

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
