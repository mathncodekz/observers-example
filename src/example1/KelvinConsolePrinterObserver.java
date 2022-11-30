package example1;

public class KelvinConsolePrinterObserver implements Observer {
    @Override
    public void handle(Temperature t) {
        System.out.println("Kelvin " + (t.getCelsiusDegrees() + 273) + "K");
    }
}
