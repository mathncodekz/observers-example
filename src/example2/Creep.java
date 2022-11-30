package example2;

import java.util.ArrayList;
import java.util.List;

public class Creep extends Unit {

    public Creep(int strength, int maxHP, int hp, List<Effect> effects, List<UnitObserver> onDieObservers, List<UnitObserver> onDamageObservers, List<UnitObserver> onAttackObservers) {
        super(strength, maxHP, hp, effects, onDieObservers, onDamageObservers, onAttackObservers);
    }

    @Override
    public List<UnitObserver> observers() {
        List<UnitObserver> total = new ArrayList<>();
        total.addAll(getOnDieObservers());
        total.addAll(getOnAttackObservers());
        total.addAll(getOnDamageObservers());
        return total;
    }

    @Override
    public void notifyObserver(UnitObserver o) {
        o.handle(this);
    }
}
