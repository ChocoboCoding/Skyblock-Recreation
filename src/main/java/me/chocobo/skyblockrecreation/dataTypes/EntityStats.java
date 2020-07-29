package me.chocobo.skyblockrecreation.dataTypes;

public class EntityStats {
    protected int maxHealth, currentHealth;

    public EntityStats(int maxHealth) {
        System.out.println("EntityStats.EntityStats 1");
        setMaxHealth(maxHealth);
        System.out.println("EntityStats.EntityStats 2");
        setCurrentHealth(maxHealth);
        System.out.println("EntityStats.EntityStats 3");
    }

    public int getMaxHealth() {
        System.out.println("EntityStats.getMaxHealth 1");
        return maxHealth;
    }
    public int getCurrentHealth() {
        System.out.println("EntityStats.getCurrentHealth 1");
        return currentHealth;
    }

    public EntityStats setMaxHealth(int maxHealth) {
        System.out.println("EntityStats.setMaxHealth 1");
        this.maxHealth = maxHealth;
        System.out.println("EntityStats.setMaxHealth 2");
        return this;
    }
    public EntityStats setCurrentHealth(int currentHealth) {
        System.out.println("EntityStats.setCurrentHealth 1");
        this.currentHealth = currentHealth;
        System.out.println("EntityStats.setCurrentHealth 2");
        return this;
    }
}
