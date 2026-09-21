package AbstractFactory;

public class World {

    private HouseFactory factory;

    public World(HouseFactory factory) {
        this.factory = factory;
    }

    public void start() {

        Character character = factory.createCharacter();
        Weapon weapon = factory.createWeapon();
        Location location = factory.createLocation();

        location.enter();
        character.introduce();
        weapon.use();
    }
}