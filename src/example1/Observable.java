package example1;

import java.util.List;

public interface Observable {
    List<Observer> getObservers();
    void notifyObserver(Observer observer);

    default void notifyAllObservers() {
        for (Observer o : getObservers()) {
            notifyObserver(o);
        }
    }
}
