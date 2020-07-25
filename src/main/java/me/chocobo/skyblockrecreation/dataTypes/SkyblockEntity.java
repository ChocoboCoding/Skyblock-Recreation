package me.chocobo.skyblockrecreation.dataTypes;

public class SkyblockEntity {
    protected EntityStats entityStats;


    public EntityStats getStats() {
        return entityStats;
    }
    public int getMaxHealth() {
        return entityStats.getMaxHealth();
    }
    public int getCurrentHealth() {
        return entityStats.getCurrentHealth();
    }

    public SkyblockEntity setEntityStats(EntityStats entityStats) {
        this.entityStats = entityStats;
        return this;
    }
    public SkyblockEntity setMaxHealth(int maxHealth) {
        entityStats.setMaxHealth(maxHealth);
        return this;
    }
    public SkyblockEntity setCurrentHealth(int currentHealth) {
        entityStats.setCurrentHealth(currentHealth);
        return this;
    }
}
