package FactoryMethod;

public class WightCreator extends MonsterCreator {

    @Override
    protected Monster createMonster() {
        return new Wight();
    }
}