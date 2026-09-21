package FactoryMethod;

public class Wight implements Monster {

    @Override
    public void attack() {
        int damage = 30;
        int hits = 2;

        System.out.println("Wight attacks " + hits + " times.");
        System.out.println("Total damage: " + (damage * hits));
    }
}