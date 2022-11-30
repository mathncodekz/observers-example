package example2;

import java.util.ArrayList;
import java.util.List;

public class VampireAttackObserver implements UnitObserver {
    @Override
    public void handle(Unit unit) {
        List<Effect> effects = unit.getEffects();
        for (Effect e : effects) {
            if (e.getName().equals("Vampire Attack")) {
                unit.setHp(unit.getHp() + unit.getStrength());
            }
        }
    }
}
