package AbstractFactory;

public class LannisterCharacter implements Character {

    @Override
    public void introduce() {
        int gold = 100;

        if (gold > 50) {
            System.out.println("Lannister character uses his wealth to gain influence.");
        } else {
            System.out.println("Lannister character has little gold.");
        }
    }
}