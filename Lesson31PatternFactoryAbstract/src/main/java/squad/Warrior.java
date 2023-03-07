package squad;

public class Warrior implements WeaponType {
    @Override
    public void getWeapon() {
        System.out.println("Warrior using sworn");
    }
}
