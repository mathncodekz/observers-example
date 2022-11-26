public class Main {
    public static void main(String[] args) {
        Temperature t = new Temperature(30.0);
        Observer fahrenheitObserver = new FahrenheitConsolePrinterObserver();
        Observer kelvinObserver = new KelvinConsolePrinterObserver();

        t.getObservers().add(fahrenheitObserver);
        t.getObservers().add(kelvinObserver);

        t.setCelsiusDegrees(20);

    }
}