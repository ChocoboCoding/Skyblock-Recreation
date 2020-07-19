package me.chocobo.skyblockrecreation.utils;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockItem;
import me.chocobo.skyblockrecreation.enums.ItemType;

import java.util.List;

public class LoreBuilder {
    List<String> lore;
    ItemType[] itemTypes = ItemType.values();

    public LoreBuilder builder(SkyblockItem item) {
        lore = item.getLore();
        switch(item.getRarity()){
            case COMMON:
                lore.add("§lCOMMON");
            case UNCOMMON:
                lore.add("§l§2UNCOMMON");
            case RARE:
                lore.add("§l§1RARE");
            case EPIC:
                lore.add("§l§5EPIC");
            case LEGENDARY:
                lore.add("§l§6LEGENDARY");
        }
        int lastLore = lore.size()-1;
        switch (item.getType()) {
            case WEAPON:
                lore.add(lastLore, "§8This item can be reforged!");
                lore.set(lastLore, lore.get(lastLore) + " WEAPON");

            case ARMOR:
                lore.add(lastLore, "§8This item can be reforged!");
                lore.set(lastLore, lore.get(lastLore) + " ARMOR");

            case ACCESSORIE:
                lore.set(lastLore, lore.get(lastLore) + " ACCESSORIE");
        }
        return this;
    }

    public LoreBuilder(){

    }
}
