package me.chocobo.skyblockrecreation.dataTypes;

import junit.framework.Assert;
import junit.framework.TestCase;
import me.chocobo.skyblockrecreation.enums.ItemRarity;
import me.chocobo.skyblockrecreation.enums.ItemType;
import me.chocobo.skyblockrecreation.enums.Reforge;
import me.chocobo.skyblockrecreation.enums.Rune;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.Material;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SkyblockItemTest {
    /*

    @Test
    public void testGetName() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        Assert.assertEquals("Test Blade", item.getName());
    }

    @Test
    public void getMaterial() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        Assert.assertEquals(Material.GOLD_BLOCK, item.getMaterial());
    }

    @Test
    public void getAmount() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        Assert.assertEquals(1, item.getAmount());
    }

    @Test
    public void getRarity() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        Assert.assertEquals(ItemRarity.LEGENDARY, item.getRarity());
    }

    @Test
    public void getType() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        Assert.assertEquals(ItemType.NORMAL, item.getType());
    }

    @Test
    public void getReforge() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        Assert.assertEquals(Reforge.DEFAULT, item.getReforge());
    }

    @Test
    public void getLore() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        List<String> lore = new ArrayList<>();
        lore.add("Test lore line 1");
        lore.add("Test lore line 2");
        lore.add("Test lore line 3");
        Assert.assertEquals(lore, item.getLore());
    }

    @Test
    public void getHpb() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        Assert.assertEquals(0, item.getHpb());
    }

    @Test
    public void getItemStats() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);
        ItemStats itemStats = new ItemStats().setDamage(500).setStrength(500).setCritHit(100).setCritDamage(500).setAttackSpeed(500).setDefense(500).setMovementSpeed(500).setIntelligence(500);

        item.setItemStats(itemStats);
        Assert.assertEquals(itemStats, item.getStats());
    }

    @Test
    public void getDamage() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        Assert.assertEquals(500, item.getDamage());
        Assert.assertEquals(500, item.getStats().getDamage());
    }

    @Test
    public void getStrength() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        Assert.assertEquals(100, item.getStrength());
        Assert.assertEquals(100, item.getStats().getStrength());
    }

    @Test
    public void getCritDamage() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(38);

        Assert.assertEquals(30, item.getCritDamage());
        Assert.assertEquals(30, item.getStats().getCritDamage());
    }

    @Test
    public void getCritHit() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(38);

        Assert.assertEquals(5, item.getCritHit());
        Assert.assertEquals(5, item.getStats().getCritHit());
    }

    @Test
    public void getAttackSpeed() {
    }

    @Test
    public void getIntelligence() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        Assert.assertEquals(500, item.getIntelligence());
        Assert.assertEquals(500, item.getStats().getIntelligence());
    }

    @Test
    public void getMovementSpeed() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        Assert.assertEquals(500, item.getMovementSpeed());
        Assert.assertEquals(500, item.getStats().getMovementSpeed());
    }

    @Test
    public void getDefense() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        Assert.assertEquals(500, item.getDefense());
        Assert.assertEquals(500, item.getStats().getDefense());
    }

    @Test
    public void getRune() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        Assert.assertEquals(Rune.BLOOD, item.getRune());
    }

    @Test
    public void testSetName() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        item.setName("Test");
        Assert.assertEquals("Test", item.getName());
    }

    @Test
    public void setMaterial() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        item.setMaterial(Material.WOOD_SWORD);
        Assert.assertEquals(Material.WOOD_SWORD, item.getMaterial());
    }

    @Test
    public void setAmount() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        item.setAmount(2);
        Assert.assertEquals(2, item.getAmount());
    }

    @Test
    public void setRarity() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        item.setRarity(ItemRarity.EPIC);
        Assert.assertEquals(ItemRarity.EPIC, item.getRarity());
    }

    @Test
    public void setType() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        item.setType(ItemType.BOW);
        Assert.assertEquals(ItemType.BOW, item.getType());
    }

    @Test
    public void setReforge() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        item.setReforge(Reforge.FABLED);
        Assert.assertEquals(Reforge.FABLED, item.getReforge());
    }

    @Test
    public void setLore() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        List<String> lore = new ArrayList<>();
        lore.add("ABC");
        item.setLore("ABC");
        Assert.assertEquals(lore, item.getLore());
    }

    @Test
    public void setHpb() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        item.setHpb(10);
        Assert.assertEquals(10, item.getHpb());
    }

    @Test
    public void addHpb() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        item.addHpb();
        Assert.assertEquals(1, item.getHpb());
    }

    @Test
    public void setItemStats() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);
        ItemStats itemStats = new ItemStats().setDamage(50).setCritHit(50).setCritDamage(50);

        item.setItemStats(itemStats);
        Assert.assertEquals(itemStats, item.getStats());
    }

    @Test
    public void setDamage() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        item.setDamage(99);
        Assert.assertEquals(99, item.getDamage());
    }

    @Test
    public void addDamage() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.addDamage(100);
        Assert.assertEquals(600, item.getDamage());
        Assert.assertEquals(600, item.getStats().getDamage());
    }

    @Test
    public void removeDamage() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.removeDamage(100);
        Assert.assertEquals(400, item.getDamage());
        Assert.assertEquals(400, item.getStats().getDamage());
    }

    @Test
    public void setStrength() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(39);

        item.setStrength(99);
        Assert.assertEquals(99, item.getStrength());
        Assert.assertEquals(99, item.getStats().getStrength());
    }

    @Test
    public void addStrength() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.addStrength(100);
        Assert.assertEquals(600, item.getStrength());
        Assert.assertEquals(600, item.getStats().getStrength());
    }

    @Test
    public void removeStrength() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.removeStrength(100);
        Assert.assertEquals(400, item.getStrength());
        Assert.assertEquals(400, item.getStats().getStrength());
    }

    @Test
    public void setCritDamage() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.setCritDamage(100);
        Assert.assertEquals(100, item.getCritDamage());
        Assert.assertEquals(100, item.getStats().getCritDamage());
    }

    @Test
    public void addCritDamage() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.addCritDamage(100);
        Assert.assertEquals(600, item.getCritDamage());
    }

    @Test
    public void removeCritDamage() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.removeCritDamage(100);
        Assert.assertEquals(400, item.getCritDamage());
    }

    @Test
    public void setCritHit() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.setCritHit(500);
        Assert.assertEquals(500, item.getCritHit());
    }

    @Test
    public void addCritHit() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.addCritHit(100);
        Assert.assertEquals(200, item.getCritHit());
    }

    @Test
    public void removeCritHit() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.removeCritHit(100);
        Assert.assertEquals(0, item.getCritHit());
    }

    @Test
    public void setAttackSpeed() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.setAttackSpeed(100);
        Assert.assertEquals(100, item.getAttackSpeed());
    }

    @Test
    public void addAttackSpeed() {
        Startup.weaponCache();
        SkyblockItem item = Startup.getSkyblockItem(42);

        item.addAttackSpeed(100);
        Assert.assertEquals(100, item.getAttackSpeed());
    }

    @Test
    public void setIntelligence() {
    }

    @Test
    public void addIntelligence() {
    }

    @Test
    public void removeIntelligence() {
    }

    @Test
    public void setMovementSpeed() {
    }

    @Test
    public void addMovementSpeed() {
    }

    @Test
    public void removeMovementSpeed() {
    }

    @Test
    public void setDefense() {
    }

    @Test
    public void addDefense() {
    }

    @Test
    public void removeDefense() {
    }

    @Test
    public void setRune() {
    }


    @Test
    public void testCreateItem() {
    }

     */
}