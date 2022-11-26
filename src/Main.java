public class Main {
    public static void main(String[] args) {
        Temperature t = new Temperature(30.0);
        Observer fahrenheitObserver = new FahrenheitConsolePrinterObserver();
        Observer kelvinObserver = new KelvinConsolePrinterObserver();

        t.getObservers().add(fahrenheitObserver);
        t.getObservers().add(kelvinObserver);

        Temperature t2 = new Temperature(10);
        t2.getObservers().add(fahrenheitObserver);

        t2.setCelsiusDegrees(15);

    }
}