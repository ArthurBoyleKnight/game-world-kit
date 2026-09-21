package AbstractFactory;

public class StarkCharacter implements Character {

    @Override
    public void introduce() {
        int honor = 100;

        if (honor >= 80) {
            System.out.println("Stark character fights with honor.");
        } else {
            System.out.println("Stark character needs more honor.");
        }
    }
}