package me.chocobo.skyblockrecreation.dataTypes;

public class EntityStats {
    protected int maxHealth, currentHealth;


    public int getMaxHealth() {
        return maxHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }

    public EntityStats setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        return this;
    }
    public EntityStats setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
        return this;
    }
}
