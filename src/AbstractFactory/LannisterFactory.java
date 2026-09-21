package AbstractFactory;

public class LannisterFactory implements HouseFactory {

    @Override
    public Character createCharacter() {
        return new LannisterCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new LannisterWeapon();
    }

    @Override
    public Location createLocation() {
        return new KingsLanding();
    }
}