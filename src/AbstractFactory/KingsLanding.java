package AbstractFactory;

public class KingsLanding implements Location {

    @Override
    public void enter() {
        String[] areas = {
            "Red Keep",
            "Throne Room",
            "Market"
        };

        System.out.println("Areas in King's Landing:");

        for (String area : areas) {
            System.out.println("- " + area);
        }
    }
}