package models.squad;

public class Wizard implements WeaponType {
    @Override
    public void getWeapon() {
        System.out.println("Wizard using magic");
    }
}
