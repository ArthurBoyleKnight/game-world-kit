package FactoryMethod;

public class WhiteWalkerCreator extends MonsterCreator {

    @Override
    protected Monster createMonster() {
        return new WhiteWalker();
    }
}