package example1;

public class Main {
    public static void main(String[] args) {
        Temperature t = new Temperature(30.0);
        Observer fahrenheitObserver = new FahrenheitConsolePrinterObserver();
        Observer kelvinObserver = new KelvinConsolePrinterObserver();
        Observer hotColdObserver = new HotColdObserver();
        Observer adviseObserver = new AdviseObserver();

        t.getObservers().add(fahrenheitObserver);
        t.getObservers().add(kelvinObserver);
        t.getObservers().add(hotColdObserver);
        t.getObservers().add(adviseObserver);

        t.setCelsiusDegrees(31);


    }
}