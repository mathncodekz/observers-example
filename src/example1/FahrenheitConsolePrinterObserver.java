package example1;

public class FahrenheitConsolePrinterObserver implements Observer {
    @Override
    public void handle(Temperature t) {
        System.out.println("Fahrenheit: " + t.asFahrenheitDegrees() + "F");
    }
}
