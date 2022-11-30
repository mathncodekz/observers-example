package example2;

import java.util.ArrayList;
import java.util.List;

public abstract class Unit implements UnitObservable {
    private int strength;
    private int maxHP;
    private int hp;
    private List<Effect> effects;
    private List<UnitObserver> onDieObservers;
    private List<UnitObserver> onDamageObservers;
    private List<UnitObserver> onAttackObservers;

    public Unit(int strength, int maxHP, int hp, List<Effect> effects, List<UnitObserver> onDieObservers, List<UnitObserver> onDamageObservers, List<UnitObserver> onAttackObservers) {
        this.strength = strength;
        this.maxHP = maxHP;
        this.hp = hp;
        this.effects = effects;
        this.onDieObservers = onDieObservers;
        this.onDamageObservers = onDamageObservers;
        this.onAttackObservers = onAttackObservers;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public List<Effect> getEffects() {
        return effects;
    }

    public void setEffects(List<Effect> effects) {
        this.effects = effects;
    }

    public List<UnitObserver> getOnDieObservers() {
        return onDieObservers;
    }

    public void setOnDieObservers(List<UnitObserver> onDieObservers) {
        this.onDieObservers = onDieObservers;
    }

    public List<UnitObserver> getOnDamageObservers() {
        return onDamageObservers;
    }

    public void setOnDamageObservers(List<UnitObserver> onDamageObservers) {
        this.onDamageObservers = onDamageObservers;
    }

    public List<UnitObserver> getOnAttackObservers() {
        return onAttackObservers;
    }

    public void setOnAttackObservers(List<UnitObserver> onAttackObservers) {
        this.onAttackObservers = onAttackObservers;
    }

    public void onDie() {
        for (UnitObserver observer : onDieObservers) {
            observer.handle(this);
        }
    }

    public void onDamage(int damage) {
        for (UnitObserver observer : onDamageObservers) {
            observer.handle(this);
        }
    }

    public void onAttack(Unit unit) {
        for (UnitObserver observer : onAttackObservers) {
            observer.handle(this);
        }
    }

    public void addEffect(Effect effect) {
        effects.add(effect);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "strength=" + strength +
                ", maxHP=" + maxHP +
                ", hp=" + hp +
                ", effects=" + effects +
                ", onDieObservers=" + onDieObservers +
                ", onDamageObservers=" + onDamageObservers +
                ", onAttackObservers=" + onAttackObservers +
                '}';
    }
}
