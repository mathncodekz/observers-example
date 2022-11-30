package example1;

public class HotColdObserver implements Observer {
    @Override
    public void handle(Temperature t) {
        if (t.getCelsiusDegrees() > 30) {
            System.out.println("It's Hot!");
        } else if (t.getCelsiusDegrees() > 15) {
            System.out.println("It's warm");
        } else if (t.getCelsiusDegrees() <= 15) {
            System.out.println("It's cold");
        }
    }
}
