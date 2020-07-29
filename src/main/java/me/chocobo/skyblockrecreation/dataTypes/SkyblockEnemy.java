package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.enums.EnemyType;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;

public class SkyblockEnemy extends SkyblockEntity{
    protected EnemyStats enemyStats;
    protected Entity enemy;

    public SkyblockEnemy(EnemyStats enemyStats) {
        super(enemyStats);
        System.out.println("SkyblockEnemy.SkyblockEnemy 1");
        setEnemyStats(enemyStats);
        System.out.println("SkyblockEnemy.SkyblockEnemy 2");
    }
    public EnemyType getType() {
        System.out.println("SkyblockEnemy.getType 1");
        return enemyStats.getEnemyType();
    }
    public EnemyStats getEnemyStats() {
        System.out.println("SkyblockEnemy.getEnemyStats 1");
        return enemyStats;
    }
    public int getLevel() {
        System.out.println("SkyblockEnemy.getLevel 1");
        return enemyStats.getLevel();
    }
    public int getDamage() {
        System.out.println("SkyblockEnemy.getDamage 1");
        return enemyStats.getDamage();
    }
    @Override
    public int getMaxHealth() {
        System.out.println("SkyblockEnemy.getMaxHealth 1");
        return super.getMaxHealth();
    }
    @Override
    public int getCurrentHealth() {
        System.out.println("SkyblockEnemy.getCurrentHealth 1");
        return super.getCurrentHealth();
    }
    public Entity getEnemy() {
        System.out.println("SkyblockEnemy.getEnemy 1");
        return enemy;
    }

    public SkyblockEnemy setType(EnemyType enemyType) {
        System.out.println("SkyblockEnemy.setType 1");
        enemyStats.setEnemyType(enemyType);
        System.out.println("SkyblockEnemy.setType 2");
        return this;
    }
    public SkyblockEnemy setEnemyStats(EnemyStats enemyStats) {
        System.out.println("SkyblockEnemy.setEnemyStats 1");
        this.enemyStats = enemyStats;
        System.out.println("SkyblockEnemy.setEnemyStats 2");
        return this;
    }
    public SkyblockEnemy setDamage(int damage) {
        System.out.println("SkyblockEnemy.setDamage 1");
        enemyStats.setDamage(damage);
        System.out.println("SkyblockEnemy.setDamage 2");
        return this;
    }
    public SkyblockEnemy setLevel(int level) {
        System.out.println("SkyblockEnemy.setLevel 1");
        enemyStats.setLevel(level);
        System.out.println("SkyblockEnemy.setLevel 2");
        return this;
    }

    public SkyblockEnemy updateName() {
        enemy.setCustomName("§8[§7Lv" + getLevel() + "§8] §c " + getType().getName() + " §a" + this.getCurrentHealth() + "§r/§a" + this.getMaxHealth() + "§l§c♥");
        return this;
    }

    public SkyblockEnemy damage(SkyblockPlayer damager) {
        System.out.println("SkyblockEnemy.damage 1 1");
        int damage = (int) Math.round(5 + (damager.getStats().getStrength()/5) * ((1 + damager.getStats().getStrength()) / 100));
        try {
            System.out.println(damager.getItemInHand().getItemStats().getDamage());
            System.out.println(damager.getStats().getStrength());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("SkyblockEnemy.damage 1 2");
        setCurrentHealth(getEnemyStats().getCurrentHealth() - damage);
        System.out.println("SkyblockEnemy.damage 1 3");
        if (getCurrentHealth() < 0) setCurrentHealth(0);
        System.out.println("SkyblockEnemy.damage 1 4");
        updateName();
        System.out.println("SkyblockEnemy.damage 1 5");
        return this;
    }

    public SkyblockEnemy damage(SkyblockEnemy damager) {
        System.out.println("SkyblockEnemy.damage 2 1");
        int damage = damager.getDamage();
        System.out.println("SkyblockEnemy.damage 2 2");
        setCurrentHealth(getEnemyStats().getCurrentHealth() - damage);
        System.out.println("SkyblockEnemy.damage 2 3");
        updateName();
        System.out.println("SkyblockEnemy.damage 2 4");
        return this;
    }

    public SkyblockEnemy damage(int damage) {
        System.out.println("SkyblockEnemy.damage 3 1");
        setCurrentHealth(getEnemyStats().getCurrentHealth() - damage);
        System.out.println("SkyblockEnemy.damage 3 2");
        updateName();
        System.out.println("SkyblockEnemy.damage 3 3");
        return this;
    }

    public SkyblockEnemy spawnEnemy(World world, Location location) {
        System.out.println("SkyblockEnemy.spawnEnemy 1");
        enemy = world.spawnEntity(location, getType().getType());
        System.out.println("SkyblockEnemy.spawnEnemy 2");
        enemy.setCustomName("§8[§7Lv" + getLevel() + "§8] §c " + getType().getName() + " §a" + this.getCurrentHealth() + "§r/§a" + this.getMaxHealth() + "§l§c♥");
        System.out.println("SkyblockEnemy.spawnEnemy 3");
        Startup.addLivingEnemy(enemy.getUniqueId(), this);
        System.out.println("SkyblockEnemy.spawnEnemy 4");
        return this;
    }
}
