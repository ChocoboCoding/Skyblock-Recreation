package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.utils.Startup;
import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

public class SkyblockPlayerTest {
/*
    @Test
    public void getMaxHealth() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(1000, player.getMaxHealth());
        Assert.assertEquals(1000, player.getStats().getMaxHealth());
    }

    @Test
    public void getCurrentHealth() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(1000, player.getCurrentHealth());
        Assert.assertEquals(1000, player.getStats().getCurrentHealth());
    }

    @Test
    public void getUuid() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(uuid, player.getUuid());
    }

    @Test
    public void testGetStats() {
        UUID uuid = UUID.randomUUID();
        PlayerStats stats = new PlayerStats(1000).setStrength(20).setCritHit(20).setCritDamage(50).
                setMovementSpeed(100).setIntelligence(100).setAttackSpeed(100);
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setPlayerStats(stats);
        Assert.assertEquals(stats, player.getStats());
    }

    @Test
    public void getInventory() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(new SkyblockInventory(), player.getInventory());
    }

    @Test
    public void getStrength() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(20, player.getStrength());
        Assert.assertEquals(20, player.getStats().getStrength());
    }

    @Test
    public void getCritDamage() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(50, player.getCritDamage());
        Assert.assertEquals(50, player.getStats().getCritDamage());
    }

    @Test
    public void getCritHit() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(20, player.getCritHit());
        Assert.assertEquals(20, player.getStats().getCritHit());
    }

    @Test
    public void getAttackSpeed() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(100, player.getAttackSpeed());
        Assert.assertEquals(100, player.getStats().getAttackSpeed());
    }

    @Test
    public void getIntelligence() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(100, player.getIntelligence());
        Assert.assertEquals(100, player.getStats().getIntelligence());
    }

    @Test
    public void getMana() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(0, player.getMana());
        Assert.assertEquals(0, player.getStats().getMana());
    }

    @Test
    public void getMovementSpeed() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(100, player.getMovementSpeed());
        Assert.assertEquals(100, player.getStats().getMovementSpeed());
    }

    @Test
    public void getDefense() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(0, player.getDefense());
        Assert.assertEquals(0, player.getStats().getDefense());
    }

    @Test
    public void getSeaCreatureChance() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(0, player.getSeaCreatureChance());
        Assert.assertEquals(0, player.getStats().getSeaCreatureChance());
    }

    @Test
    public void getMagicFind() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(0, player.getMagicFind());
        Assert.assertEquals(0, player.getStats().getMagicFind());
    }

    @Test
    public void getPetLuck() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        Assert.assertEquals(0, player.getPetLuck());
        Assert.assertEquals(0, player.getStats().getPetLuck());
    }

    @Test
    public void setMaxHealth() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setMaxHealth(100);
        Assert.assertEquals(100, player.getMaxHealth());
        Assert.assertEquals(100, player.getCurrentHealth());
    }

    @Test
    public void setCurrentHealth() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setCurrentHealth(100);
        Assert.assertEquals(100, player.getCurrentHealth());
    }

    @Test
    public void setUuid() {
        UUID uuid = UUID.randomUUID();
        UUID uuid1 = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setUuid(uuid1);
        Assert.assertEquals(uuid1, player.getUuid());
    }

    @Test
    public void setPlayerStats() {
        UUID uuid = UUID.randomUUID();
        PlayerStats stats = new PlayerStats(100).setStrength(15).setCritHit(15).setCritDamage(40).
                setMovementSpeed(75).setIntelligence(75).setAttackSpeed(75);
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setPlayerStats(stats);
        Assert.assertEquals(stats, player.getStats());
    }

    @Test
    public void setInventory() {
        UUID uuid = UUID.randomUUID();
        SkyblockInventory inventory = new SkyblockInventory();
        inventory.setSkyblockItem(Startup.getSkyblockItem(39), 6);
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setInventory(inventory);
        Assert.assertEquals(inventory, player.getInventory());
    }

    @Test
    public void setStrength() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setStrength(15);
        Assert.assertEquals(15, player.getStrength());
    }

    @Test
    public void addStrength() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addStrength(10);
        Assert.assertEquals(30, player.getStrength());
    }

    @Test
    public void removeStrength() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removeStrength(10);
        Assert.assertEquals(10, player.getStrength());
    }

    @Test
    public void setCritDamage() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setCritDamage(45);
        Assert.assertEquals(45, player.getCritDamage());
    }

    @Test
    public void addCritDamage() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addCritDamage(10);
        Assert.assertEquals(60, player.getCritDamage());
    }

    @Test
    public void removeCritDamage() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removeCritDamage(10);
        Assert.assertEquals(40, player.getCritDamage());
    }

    @Test
    public void setCritHit() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setCritHit(15);
        Assert.assertEquals(15, player.getCritHit());
        Assert.assertEquals(15, player.getStats().getCritHit());
    }

    @Test
    public void addCritHit() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addCritHit(10);
        Assert.assertEquals(30, player.getCritHit());
        Assert.assertEquals(30, player.getStats().getCritHit());
    }

    @Test
    public void removeCritHit() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removeCritHit(10);
        Assert.assertEquals(10, player.getCritHit());
        Assert.assertEquals(10, player.getStats().getCritHit());
    }

    @Test
    public void setAttackSpeed() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setAttackSpeed(50);
        Assert.assertEquals(50, player.getAttackSpeed());
        Assert.assertEquals(50, player.getStats().getAttackSpeed());
    }

    @Test
    public void addAttackSpeed() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addAttackSpeed(10);
        Assert.assertEquals(110, player.getAttackSpeed());
        Assert.assertEquals(110, player.getStats().getAttackSpeed());
    }

    @Test
    public void removeAttackSpeed() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removeAttackSpeed(10);
        Assert.assertEquals(90, player.getAttackSpeed());
        Assert.assertEquals(90, player.getStats().getAttackSpeed());
    }

    @Test
    public void setIntelligence() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setIntelligence(50);
        Assert.assertEquals(50, player.getIntelligence());
        Assert.assertEquals(50, player.getStats().getIntelligence());
    }

    @Test
    public void addIntelligence() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addIntelligence(10);
        Assert.assertEquals(110, player.getIntelligence());
        Assert.assertEquals(110, player.getStats().getIntelligence());
    }

    @Test
    public void removeIntelligence() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removeIntelligence(10);
        Assert.assertEquals(90, player.getIntelligence());
        Assert.assertEquals(90, player.getStats().getIntelligence());
    }

    @Test
    public void setMana() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setMana(150);
        Assert.assertEquals(150, player.getMana());
        Assert.assertEquals(150, player.getStats().getMana());
    }

    @Test
    public void addMana() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addMana(10);
        Assert.assertEquals(110, player.getMana());
        //Assert.assertEquals(110, player.getStats().getMana());
    }

    @Test
    public void removeMana() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removeMana(10);
        Assert.assertEquals(90, player.getMana());
        Assert.assertEquals(90, player.getStats().getMana());
    }

    @Test
    public void setMovementSpeed() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setMovementSpeed(50);
        Assert.assertEquals(50, player.getMovementSpeed());
        Assert.assertEquals(50, player.getStats().getMovementSpeed());
    }

    @Test
    public void addMovementSpeed() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addMovementSpeed(10);
        Assert.assertEquals(110, player.getMovementSpeed());
        Assert.assertEquals(110, player.getStats().getMovementSpeed());
    }

    @Test
    public void removeMovementSpeed() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removeMovementSpeed(10);
        Assert.assertEquals(110, player.getMovementSpeed());
        Assert.assertEquals(110, player.getStats().getMovementSpeed());
    }

    @Test
    public void setDefense() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setDefense(50);
        Assert.assertEquals(50, player.getDefense());
        Assert.assertEquals(50, player.getStats().getDefense());
    }

    @Test
    public void addDefense() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addDefense(10);
        Assert.assertEquals(10, player.getDefense());
        Assert.assertEquals(10, player.getStats().getDefense());
    }

    @Test
    public void removeDefense() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removeDefense(10);
        Assert.assertEquals(-10, player.getDefense());
        Assert.assertEquals(-10, player.getStats().getDefense());
    }

    @Test
    public void setSeaCreatureChance() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setSeaCreatureChance(50);
        Assert.assertEquals(50, player.getSeaCreatureChance());
        Assert.assertEquals(50, player.getStats().getSeaCreatureChance());
    }

    @Test
    public void addSeaCreatureChance() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addSeaCreatureChance(10);
        Assert.assertEquals(10, player.getSeaCreatureChance());
        Assert.assertEquals(10, player.getStats().getSeaCreatureChance());
    }

    @Test
    public void removeSeaCreatureChance() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removeSeaCreatureChance(10);
        Assert.assertEquals(-10, player.getSeaCreatureChance());
        Assert.assertEquals(-10, player.getStats().getSeaCreatureChance());
    }

    @Test
    public void setMagicFind() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setMagicFind(50);
        Assert.assertEquals(50, player.getMagicFind());
        Assert.assertEquals(50, player.getStats().getMagicFind());
    }

    @Test
    public void addMagicFind() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addMagicFind(10);
        Assert.assertEquals(10, player.getMagicFind());
        Assert.assertEquals(10, player.getStats().getMagicFind());
    }

    @Test
    public void removeMagicFind() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removeMagicFind(10);
        Assert.assertEquals(-10, player.getMagicFind());
        Assert.assertEquals(-10, player.getStats().getMagicFind());
    }

    @Test
    public void setPetLuck() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.setPetLuck(50);
        Assert.assertEquals(50, player.getPetLuck());
        Assert.assertEquals(50, player.getStats().getPetLuck());
    }

    @Test
    public void addPetLuck() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addPetLuck(10);
        Assert.assertEquals(10, player.getPetLuck());
        Assert.assertEquals(10, player.getStats().getPetLuck());
    }

    @Test
    public void removePetLuck() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removePetLuck(10);
        Assert.assertEquals(-10, player.getPetLuck());
        Assert.assertEquals(-10, player.getStats().getPetLuck());
    }

    @Test
    public void addCurrentHealth() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.addCurrentHealth(10);
        Assert.assertEquals(1010, player.getCurrentHealth());
        Assert.assertEquals(1010, player.getStats().getCurrentHealth());
    }

    @Test
    public void removeCurrentHealth() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);

        player.removeCurrentHealth(10);
        Assert.assertEquals(990, player.getCurrentHealth());
        Assert.assertEquals(990, player.getStats().getCurrentHealth());
    }

    @Test
    public void giveItem() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);
        SkyblockItem item = Startup.getSkyblockItem(39);

        player.giveItem(item);
    }

    @Test
    public void testDamage() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer skyblockPlayer = new SkyblockPlayer(uuid);
    }

    @Test
    public void getItemInHand() {
        UUID uuid = UUID.randomUUID();
        SkyblockPlayer player = new SkyblockPlayer(uuid);
        SkyblockInventory inventory = new SkyblockInventory();

        inventory.setSkyblockItem(Startup.getSkyblockItem(39), 7);
        player.setInventory(inventory);
        Assert.assertEquals(Startup.getSkyblockItem(39), player.getItemInHand(7));
    }
 */
}