package AbstractFactory;

public class Winterfell implements Location {

    @Override
    public void enter() {
        int knight = 3;

        for (int i = 1; i <= knight; i++) {
            System.out.println("Winterfells night watch knight " + i + " is protecting the castle.");
        }
    }
}