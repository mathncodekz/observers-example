import java.util.ArrayList;
import java.util.List;

public class Temperature implements Observable {
    public static final double FAHRENHEIT_DEGREES_MULTIPLIER = 1.8;
    public static final double FAHRENHEIT_DEGREES_ADDER = 32;

    private List<Observer> observers;
    private double celsiusDegrees;

    public Temperature(double celsiusDegrees) {
        this.celsiusDegrees = celsiusDegrees;
        observers = new ArrayList<>();
    }

    public double getCelsiusDegrees() {
        return celsiusDegrees;
    }

    public void setCelsiusDegrees(double celsiusDegrees) {
        this.celsiusDegrees = celsiusDegrees;
        notifyAllObservers();
    }

    public double asFahrenheitDegrees() {
        return (celsiusDegrees * FAHRENHEIT_DEGREES_MULTIPLIER) + FAHRENHEIT_DEGREES_ADDER;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "celsiusDegrees=" + celsiusDegrees +
                '}';
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public void notifyObserver(Observer observer) {
        observer.handle(this);
    }
}
