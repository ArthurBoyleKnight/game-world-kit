package FactoryMethod;

public abstract class MonsterCreator {

    protected abstract Monster createMonster();

    public void spawnMonster() {
        Monster monster = createMonster();

        System.out.println("Monster spawned:");
        monster.attack();
    }
}