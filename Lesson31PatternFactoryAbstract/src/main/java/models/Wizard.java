package models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Wizard implements WarriorType {
    public void getWeaponType() {
        System.out.println("Wizard using magic");
    }
}
