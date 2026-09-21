package AbstractFactory;

public class LannisterWeapon implements Weapon {

    @Override
    public void use() {
        int damage = 60;
        int armor = 20;

        int finalDamage = damage - armor;

        System.out.println("Lannister weapon deals " + finalDamage + " damage after armor.");
    }
}