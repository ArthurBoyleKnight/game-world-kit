package FactoryMethod;

public class DirewolfCreator extends MonsterCreator {

    @Override
    protected Monster createMonster() {
        return new Direwolf();
    }
}