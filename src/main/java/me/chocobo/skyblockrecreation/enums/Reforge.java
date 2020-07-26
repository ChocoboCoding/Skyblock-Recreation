package me.chocobo.skyblockrecreation.enums;

import me.chocobo.skyblockrecreation.dataTypes.ItemStats;
import me.chocobo.skyblockrecreation.dataTypes.ReforgeStats;
import me.chocobo.skyblockrecreation.utils.LoreBuilder;
import org.bukkit.entity.Item;

import java.util.List;

public enum Reforge {
    DEFAULT("", ItemType.NORMAL, false, new ReforgeStats(new ItemStats(), new ItemStats(), new ItemStats(), new ItemStats(), new ItemStats()), ""),
    GENTLE("Gentle", ItemType.MELEE, true, new ReforgeStats(new ItemStats().setStrength(3).setAttackSpeed(8), new ItemStats().setStrength(5).setAttackSpeed(10), new ItemStats().setStrength(7).setAttackSpeed(15), new ItemStats().setStrength(10).setAttackSpeed(20), new ItemStats().setStrength(15).setAttackSpeed(25)), ""),
    ODD("Odd", ItemType.MELEE, true, new ReforgeStats(new ItemStats().setCritHit(12).setCritDamage(10).setIntelligence(-5), new ItemStats().setCritHit(15).setCritDamage(15).setIntelligence(-10), new ItemStats().setCritHit(15).setCritDamage(15).setIntelligence(-18), new ItemStats().setCritHit(25).setCritDamage(30).setIntelligence(-24), new ItemStats().setCritHit(25).setCritDamage(30).setIntelligence(-50)), ""),
    FAST("Fast", ItemType.MELEE, true, new ReforgeStats(new ItemStats().setAttackSpeed(10), new ItemStats().setAttackSpeed(20), new ItemStats().setAttackSpeed(30), new ItemStats().setAttackSpeed(40), new ItemStats().setAttackSpeed(50)), ""),
    FAIR("Fair", ItemType.MELEE, true, new ReforgeStats(new ItemStats().setStrength(2).setCritHit(2).setCritDamage(2).setIntelligence(2).setAttackSpeed(2), new ItemStats().setStrength(3).setCritHit(3).setCritDamage(3).setIntelligence(3).setAttackSpeed(3), new ItemStats().setStrength(4).setCritHit(4).setCritDamage(4).setIntelligence(4).setAttackSpeed(4), new ItemStats().setStrength(7).setCritHit(7).setCritDamage(7).setIntelligence(7).setAttackSpeed(7), new ItemStats().setStrength(10).setCritHit(10).setCritDamage(10).setIntelligence(10).setAttackSpeed(10)), ""),
    EPIC("Epic", ItemType.MELEE, true, new ReforgeStats(new ItemStats().setStrength(15).setCritDamage(10).setAttackSpeed(1), new ItemStats().setStrength(20).setCritDamage(15).setAttackSpeed(2), new ItemStats().setStrength(25).setCritDamage(20).setAttackSpeed(4), new ItemStats().setStrength(32).setCritDamage(27).setAttackSpeed(7), new ItemStats().setStrength(40).setCritDamage(35).setAttackSpeed(10)), ""),
    SHARP("Sharp", ItemType.MELEE, true, new ReforgeStats(new ItemStats().setCritHit(10).setCritDamage(20), new ItemStats().setCritHit(12).setCritDamage(30), new ItemStats().setCritHit(14).setCritDamage(40), new ItemStats().setCritHit(17).setCritDamage(55), new ItemStats().setCritHit(20).setCritDamage(75)), ""),

    FABLED("Fabled", ItemType.SWORD, true, new ReforgeStats(new ItemStats().setStrength(30).setCritDamage(15), new ItemStats().setStrength(35).setCritDamage(20), new ItemStats().setStrength(40).setCritDamage(25), new ItemStats().setStrength(50).setCritDamage(32), new ItemStats().setStrength(60).setCritDamage(40)), "");


    private final String name;
    private ItemType itemType;
    private final boolean normalReforging;
    private final ReforgeStats stats;
    private final List<String> lore;

    private Reforge(String name, ItemType itemType, boolean normalReforging, ReforgeStats stats, String lore) {
        this.name = name;
        this.itemType = itemType;
        this.normalReforging = normalReforging;
        this.stats = stats;
        this.lore = LoreBuilder.cutLore(lore);
    }

    public String getName() {
        return name;
    }
    public ItemType getItemType() {
        return itemType;
    }
    public boolean getNormalReforging() {
        return normalReforging;
    }
    public ReforgeStats getStats() {
        return stats;
    }
    public List<String> getLore() {
        return lore;
    }
}
