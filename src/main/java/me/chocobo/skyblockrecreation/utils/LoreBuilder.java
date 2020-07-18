package me.chocobo.skyblockrecreation.utils;

import me.chocobo.skyblockrecreation.enums.ItemRarity;
import me.chocobo.skyblockrecreation.enums.ItemType;

public class LoreBuilder {
    ItemType type;
    ItemRarity rarity;
    String[] lore;


    public LoreBuilder setType(ItemType type) {
        this.type = type;
        return this;
    }

    public LoreBuilder setRarity(ItemRarity rarity) {
        this.rarity = rarity;
        return this;
    }
}
