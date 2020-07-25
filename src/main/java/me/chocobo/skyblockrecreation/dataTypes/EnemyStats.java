package me.chocobo.skyblockrecreation.dataTypes;

public class EnemyStats extends EntityStats {

    private int level, damage, maxHp, currentHp;

    public int getLevel() {
        return level;
    }
    public int getDamage() {
        return damage;
    }
    public int getMaxHp() {
        return maxHp;
    }
    public int getCurrentHp() {
        return currentHp;
    }

    public EnemyStats setLevel(int level) {
        this.level = level;
        return this;
    }
    public EnemyStats setDamage(int damage) {
        this.damage = damage;
        return this;
    }
    public EnemyStats setMaxHp(int maxHp) {
        this.maxHp = maxHp;
        return this;
    }
    public EnemyStats setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
        return this;
    }
}
