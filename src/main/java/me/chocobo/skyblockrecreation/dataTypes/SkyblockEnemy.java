package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.enums.EnemyType;

public class SkyblockEnemy {
    private EnemyType type;
    private int level, maxHp, currentHp, damage;

    public SkyblockEnemy(EnemyType type, int level, int maxHp, int damage) {
        setType(type);
        setLevel(level);
        setMaxHp(maxHp);
        setDamage(damage);
    }

    public void setType(EnemyType type) {
        this.type = type;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public EnemyType getType() {
        return type;
    }
    public int getLevel() {
        return level;
    }
    public int getMaxHp() {
        return maxHp;
    }
    public int getCurrentHp() {
        return currentHp;
    }
    public int getDamage() {
        return damage;
    }
}
