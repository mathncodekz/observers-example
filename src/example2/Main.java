package example2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VampireAttackObserver vampireAttackObserver = new VampireAttackObserver();
        List<UnitObserver> universalOnAttackList = new ArrayList<>();
        universalOnAttackList.add(vampireAttackObserver);

        Effect effect = new Effect("Vampire Attack", "Reduces strength -2");
        Unit u = new Creep(
                5,
                100,
                100,
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                universalOnAttackList
        );
        u.addEffect(effect);

        Unit u2 = new Creep(
                3,
                100,
                50,
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                universalOnAttackList
        );

//        u.onAttack(u2);
        u2.onAttack(u);
        System.out.println("user with vampirism" + u);
        System.out.println("user without vampirism" + u2);
    }
}
