package models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Warrior implements WarriorType {
    public void getWeaponType() {
        System.out.println("Warrior using sworn");
    }
}
