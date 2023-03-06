package models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ArcherImpl implements WarriorType {
    public void getWeaponType() {
        System.out.println("Archer using arch");
    }
}
