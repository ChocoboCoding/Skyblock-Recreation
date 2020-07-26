package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.enums.ItemRarity;
import me.chocobo.skyblockrecreation.enums.ItemType;
import me.chocobo.skyblockrecreation.enums.Rune;
import me.chocobo.skyblockrecreation.utils.LoreBuilder;
import org.bukkit.Material;

import java.util.List;

public class SkyblockWeapon extends SkyblockItem {

    private Rune rune;

    public SkyblockWeapon(Material material, String name, String lore, ItemRarity rarity, ItemStats itemStats) {
        setMaterial(material);
        setName(name);
        setLore(lore);
        setType(ItemType.MELEE);
        setRarity(rarity);
        setItemStats(itemStats);
    }

    public Rune getRune() {
        return rune;
    }
}
