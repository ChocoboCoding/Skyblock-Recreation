package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.enums.EnemyType;

public class EnemyStats {

    private int level, damage, maxHealth, currentHealth;
    private EnemyType enemyType;

    public EnemyStats(int level, int maxHealth, int damage, EnemyType enemyType) {
        setMaxHealth(maxHealth);
        setCurrentHealth(maxHealth);
        System.out.println("EnemyStats.EnemyStats 1");
        setLevel(level);
        System.out.println("EnemyStats.EnemyStats 2");
        setDamage(damage);
        System.out.println("EnemyStats.EnemyStats 3");
        setEnemyType(enemyType);
        System.out.println("EnemyStats.EnemyStats 4");
    }

    public int getLevel() {
        System.out.println("EnemyStats.getLevel 1");
        return level;
    }
    public int getDamage() {
        System.out.println("EnemyStats.getDamage 1");
        return damage;
    }
    public int getMaxHealth() {
        System.out.println("EnemyStats.getMaxHealth 1");
        return maxHealth;
    }
    public int getCurrentHealth() {
        System.out.println("EnemyStats.getCurrentHealth 1");
        return currentHealth;
    }
    public EnemyType getEnemyType() {
        System.out.println("EnemyStats.getEnemyType 1");
        return enemyType;
    }

    public EnemyStats setLevel(int level) {
        System.out.println("EnemyStats.setLevel 1");
        this.level = level;
        System.out.println("EnemyStats.setLevel 2");
        return this;
    }
    public EnemyStats setDamage(int damage) {
        System.out.println("EnemyStats.setDamage 1");
        this.damage = damage;
        System.out.println("EnemyStats.setDamage 2");
        return this;
    }
    public EnemyStats setMaxHealth(int maxHealth) {
        System.out.println("EnemyStats.setMaxHealth 1");
        this.maxHealth = maxHealth;
        System.out.println("EnemyStats.setMaxHealth 2");
        return this;
    }
    public EnemyStats setCurrentHealth(int currentHealth) {
        System.out.println("EnemyStats.setCurrentHealth 1");
        this.currentHealth = currentHealth;
        System.out.println("EnemyStats.setCurrentHealth 2");
        return this;
    }
    public EnemyStats setEnemyType(EnemyType enemyType) {
        System.out.println("EnemyStats.setEnemyType 1");
        this.enemyType = enemyType;
        System.out.println("EnemyStats.setEnemyType 2");
        return this;
    }
}
