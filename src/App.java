import FactoryMethod.DirewolfCreator;
import FactoryMethod.MonsterCreator;
import FactoryMethod.WhiteWalkerCreator;
import FactoryMethod.WightCreator;

import AbstractFactory.HouseFactory;
import AbstractFactory.StarkFactory;
import AbstractFactory.LannisterFactory;
import AbstractFactory.World;

public class App {

    public static void main(String[] args) {

        System.out.println("=== Factory Method ===");

        MonsterCreator whiteWalkerCreator = new WhiteWalkerCreator();
        whiteWalkerCreator.spawnMonster();

        System.out.println();

        MonsterCreator wightCreator = new WightCreator();
        wightCreator.spawnMonster();

        System.out.println();

        MonsterCreator direwolfCreator = new DirewolfCreator();
        direwolfCreator.spawnMonster();



        System.out.println();
        System.out.println("=== Abstract Factory ===");

        HouseFactory starkFactory = new StarkFactory();
        World starkWorld = new World(starkFactory);
        starkWorld.start();

        System.out.println();

        HouseFactory lannisterFactory = new LannisterFactory();
        World lannisterWorld = new World(lannisterFactory);
        lannisterWorld.start();
    }
}