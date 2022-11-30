package example2;

import java.util.List;

public interface UnitObservable {
    List<UnitObserver> observers();
    void notifyObserver(UnitObserver o);
}
