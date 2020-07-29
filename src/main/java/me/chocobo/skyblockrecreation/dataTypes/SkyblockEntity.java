package me.chocobo.skyblockrecreation.dataTypes;

public class SkyblockEntity {
    protected EntityStats entityStats;

    public SkyblockEntity(EntityStats entityStats) {
        System.out.println("SkyblockEntity.SkyblockEntity 1");
        setEntityStats(entityStats);
        System.out.println("SkyblockEntity.SkyblockEntity 2");
        setMaxHealth(entityStats.getMaxHealth());
        System.out.println("SkyblockEntity.SkyblockEntity 3");
        setCurrentHealth(entityStats.getMaxHealth());
        System.out.println("SkyblockEntity.SkyblockEntity 4");
    }

    public EntityStats getStats() {
        System.out.println("SkyblockEntity.getEntityStats 1");
        return entityStats;
    }
    public int getMaxHealth() {
        System.out.println("SkyblockEntity.getMaxHealth 1");
        return entityStats.getMaxHealth();
    }
    public int getCurrentHealth() {
        System.out.println("SkyblockEntity.getCurrentHealth 1");
        return entityStats.getCurrentHealth();
    }

    public SkyblockEntity setEntityStats(EntityStats entityStats) {
        System.out.println("SkyblockEntity.setEntityStats 1");
        this.entityStats = entityStats;
        System.out.println("SkyblockEntity.setEntityStats 2");
        return this;
    }
    public SkyblockEntity setMaxHealth(int maxHealth) {
        System.out.println("SkyblockEntity.setMaxHealth 1");
        entityStats.setMaxHealth(maxHealth);
        System.out.println("SkyblockEntity.setMaxHealth 2");
        return this;
    }
    public SkyblockEntity setCurrentHealth(int currentHealth) {
        System.out.println("SkyblockEntity.setCurrentHealth 1");
        entityStats.setCurrentHealth(currentHealth);
        System.out.println("SkyblockEntity.setCurrentHealth 2");
        return this;
    }
}
