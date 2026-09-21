package AbstractFactory;

public class StarkFactory implements HouseFactory {

    @Override
    public Character createCharacter() {
        return new StarkCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new StarkWeapon();
    }

    @Override
    public Location createLocation() {
        return new Winterfell();
    }
}