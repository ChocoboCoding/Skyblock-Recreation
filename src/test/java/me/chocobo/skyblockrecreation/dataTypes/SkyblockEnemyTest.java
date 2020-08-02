package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.enums.EnemyType;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

public class SkyblockEnemyTest {
    /*

    @Test
    public void testGetStats() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        Assert.assertEquals(stats, enemy.getEnemyStats());
    }

    @Test
    public void testGetMaxHealth() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        Assert.assertEquals(2, enemy.getMaxHealth());
    }

    @Test
    public void testGetCurrentHealth() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        Assert.assertEquals(2, enemy.getCurrentHealth());
    }

    @Test
    public void testGetType() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        Assert.assertEquals(EnemyType.ENDERMITE, enemy.getType());
    }

    @Test
    public void testGetEnemyStats() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        Assert.assertEquals(stats, enemy.getEnemyStats());
    }

    @Test
    public void testGetLevel() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        Assert.assertEquals(1, enemy.getLevel());
    }

    @Test
    public void testGetDamage() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        Assert.assertEquals(3, enemy.getDamage());
    }

    @Test
    public void testGetEnemy() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);
    }

    @Test
    public void testSetMaxHealth() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        enemy.setMaxHealth(4);
        Assert.assertEquals(4, enemy.getMaxHealth());
    }

    @Test
    public void testSetCurrentHealth() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        enemy.setCurrentHealth(4);
        Assert.assertEquals(4, enemy.getCurrentHealth());
    }

    @Test
    public void testSetType() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        enemy.setType(EnemyType.ZEALOT);
        Assert.assertEquals(EnemyType.ZEALOT, enemy.getType());
    }

    @Test
    public void testSetEnemyStats() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        EnemyStats stats2 = new EnemyStats(4, 5, 6, EnemyType.ZEALOT);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        enemy.setEnemyStats(stats2);
        Assert.assertEquals(stats2, enemy.getEnemyStats());
    }

    @Test
    public void testSetDamage() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        enemy.setDamage(4);
        Assert.assertEquals(4, enemy.getDamage());
    }

    @Test
    public void testSetLevel() {
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);

        enemy.setLevel(4);
        Assert.assertEquals(4, enemy.getLevel());
    }

    @Test
    public void testUpdateName() {
    }

    @Test
    public void testDamage() {
        Startup.weaponCache();
        EnemyStats stats = new EnemyStats(1, 2, 3, EnemyType.ENDERMITE);
        SkyblockEnemy enemy = new SkyblockEnemy(stats);
        UUID uuid = UUID.randomUUID();
        SkyblockInventory inventory = new SkyblockInventory();
        inventory.setSkyblockItem(Startup.getSkyblockItem(42), 3);
        PlayerStats playerStats = new PlayerStats(1);
        SkyblockPlayer player = new SkyblockPlayer(uuid,  playerStats, inventory);


        enemy.damage(player);
    }

    @Test
    public void testSpawnEnemy() {
    }
     */
}