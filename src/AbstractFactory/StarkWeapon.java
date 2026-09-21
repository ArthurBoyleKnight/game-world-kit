package AbstractFactory;

public class StarkWeapon implements Weapon {

    @Override
    public void use() {
        int damage = 40;
        int attacks = 2;

        System.out.println("Stark sword attacks " + attacks + " times.");
        System.out.println("Total damage: " + (damage * attacks));
    }
}