package models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Archer implements WarriorType {
    public void getWeaponType() {
        System.out.println("Archer using arch");
    }
}
