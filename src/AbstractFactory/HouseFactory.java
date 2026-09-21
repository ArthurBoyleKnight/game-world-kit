package AbstractFactory;

public interface HouseFactory {

    Character createCharacter();

    Weapon createWeapon();

    Location createLocation();
}