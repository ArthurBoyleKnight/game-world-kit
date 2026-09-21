package FactoryMethod;

public class WhiteWalker implements Monster {

    @Override
    public void attack() {
        int damage = 50;
        System.out.println("White Walker deals " + damage + " damage.");
    }
}