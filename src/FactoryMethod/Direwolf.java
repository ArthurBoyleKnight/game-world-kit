package FactoryMethod;

public class Direwolf implements Monster {

    @Override
    public void attack() {
        int distance = 10;

        if (distance <= 10) {
            System.out.println("Direwolf performs a close-range attack.");
        } else {
            System.out.println("Direwolf is too far away.");
        }
    }
}