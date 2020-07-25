package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.SkyblockRecreation;
import me.chocobo.skyblockrecreation.enums.EnemyType;
import me.chocobo.skyblockrecreation.utils.Functions;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class SkyblockEnemy extends SkyblockEntity{
    protected EnemyType type;
    protected EnemyStats enemyStats;
    protected Entity enemy;

    public SkyblockEnemy(EnemyType type, EnemyStats enemyStats) {
        setType(type);
        setEnemyStats(enemyStats);
    }
    public EnemyType getType() {
        return type;
    }
    public EnemyStats getStats() {
        return enemyStats;
    }
    public int getLevel() {
        return enemyStats.getLevel();
    }
    public int getDamage() {
        return enemyStats.getDamage();
    }

    public SkyblockEnemy setType(EnemyType type) {
        this.type = type;
        return this;
    }
    public SkyblockEnemy setEnemyStats(EnemyStats enemyStats) {
        this.enemyStats = enemyStats;
        return this;
    }
    public SkyblockEnemy setDamage(int damage) {
        enemyStats.setDamage(damage);
        return this;
    }
    public SkyblockEnemy setLevel(int level) {
        enemyStats.setLevel(level);
        return this;
    }


    public SkyblockEnemy damage(SkyblockPlayer damager) {
        int damage = (int) Math.round(5 + damager.getItemInHand().getItemStats().getDamage() + (damager.getStats().getStrength()/5) * (1 + damager.getStats().getStrength() / 100));
        setCurrentHealth(getStats().getCurrentHealth() - damage);
        return this;
    }

    public SkyblockEnemy damage(SkyblockEnemy damager) {
        int damage = damager.getDamage();
        setCurrentHealth(getStats().getCurrentHealth() - damage);
        return this;
    }

    public SkyblockEnemy damage(int damage) {
        setCurrentHealth(getStats().getCurrentHealth() - damage);
        return this;
    }

    public SkyblockEnemy spawnEnemy(World world, Location location) {
        enemy = world.spawnEntity(location, type.getType());
        enemy.setCustomName("§8[§7Lv" + getLevel() + "§8] §c " + getType().getName() + " §a" + getCurrentHealth() + "§r/§a" + getMaxHealth() + "§c♥");
        Startup.addLivingEnemy(enemy.getUniqueId(), this);
        return this;
    }
}
