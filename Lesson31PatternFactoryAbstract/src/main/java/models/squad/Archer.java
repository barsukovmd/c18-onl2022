package models.squad;

public class Archer implements WeaponType {
    @Override
    public void getWeapon() {
        System.out.println("Archer using arch");
    }
}
