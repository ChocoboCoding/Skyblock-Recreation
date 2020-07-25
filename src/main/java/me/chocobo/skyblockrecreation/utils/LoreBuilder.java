package me.chocobo.skyblockrecreation.utils;

import me.chocobo.skyblockrecreation.dataTypes.ItemStats;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockItem;
import me.chocobo.skyblockrecreation.enums.ItemType;

import java.util.ArrayList;
import java.util.List;

public class LoreBuilder {
    List<String> tempLore;
    List<String> finalLore;
    ItemType[] itemTypes = ItemType.values();

    public LoreBuilder builder(SkyblockItem item) {


        if (item.getType().equals(ItemType.MELEE) || item.getType().equals(ItemType.SWORD) || item.getType().equals(ItemType.ROD) || item.getType().equals(ItemType.BOW)) {
            addWeaponStats(item);
        }
        addEnchantments(item);
        addRune(item);
        addReforgeDescription(item);
        finalLore.addAll(item.getLore());


        if (item.getType() != ItemType.ACCESSORY || item.getType() != ItemType.NORMAL) {
            finalLore.add("§8This item can be reforged!");
        }
        finalLore.add(item.getRarity().getLoreMessage() + " " + item.getType().getLoreMessage());
        return this;
    }

    public LoreBuilder(){

    }



    private LoreBuilder addWeaponStats(SkyblockItem item) {
        ItemStats reforgeStats = item.getReforge().getStats().getStats(item.getRarity().getRarity());
        finalLore.add("§7Damage: §c+" + item.getItemStats().getDamage());
        if (item.getItemStats().getStrength() != 0) finalLore.add("§7Strength: §c+" + item.getItemStats().getStrength());
        if (item.getHpb() != 0) {
            finalLore.set(0, finalLore.get(0) + " §e(+" + item.getHpb() * 2 + ")");
            finalLore.set(1, finalLore.get(1) + " §e(+" + item.getHpb() * 2 + ")");
        }
        if (item.getItemStats().getStrength() != 0) if (reforgeStats.getStrength() != 0) finalLore.set(finalLore.size()-1, finalLore.get(finalLore.size()-1) + " §9(" + item.getReforge().getName() + " " + reforgeStats.getStrength() + ")");
        if (item.getItemStats().getCritHit() != 0) {
            finalLore.add("§7Crit Chance: §c+" + item.getItemStats().getCritHit() + "%");
            if (reforgeStats.getStrength() != 0) finalLore.set(finalLore.size()-1, finalLore.get(finalLore.size()-1) + " §9(" + item.getReforge().getName() + " " + reforgeStats.getCritHit() + "%)");
        }
        if (item.getItemStats().getCritDamage() != 0) {
            finalLore.add("§7Crit Damage: §c+" + item.getItemStats().getCritDamage() + "%");
            if (reforgeStats.getCritDamage() != 0) finalLore.set(finalLore.size()-1, finalLore.get(finalLore.size()-1) + " §9(" + item.getReforge().getName() + " " + reforgeStats.getCritDamage() + "%)");
        }
        if (item.getItemStats().getAttackSpeed() != 0) {
            finalLore.add("§7Bonus Attack Speed: §c" + item.getItemStats().getAttackSpeed() + "%");
            if (reforgeStats.getAttackSpeed() != 0) finalLore.set(finalLore.size()-1, finalLore.get(finalLore.size()-1) + " §9(" + item.getReforge().getName() + " " + reforgeStats.getAttackSpeed() + "%)");
        }

        if (item.getItemStats().getIntelligence() != 0) {
            finalLore.add("");
            finalLore.add("§7Intelligence: §a+" + item.getItemStats().getIntelligence());

            if (reforgeStats.getIntelligence() != 0) finalLore.set(finalLore.size()-1, finalLore.get(finalLore.size()-1) + " §9(" + item.getReforge().getName() + " " + reforgeStats.getIntelligence() + ")");
        }
        finalLore.add("");
        return this;
    }

    private LoreBuilder addEnchantments(SkyblockItem item) {
        finalLore.add("Enchantment list");
        finalLore.add("");
        return this;
    }

    private LoreBuilder addRune(SkyblockItem item) {
        finalLore.add(item.getRune().getName());
        finalLore.add(item.getRune().getDescription());
        return this;
    }

    private LoreBuilder addReforgeDescription(SkyblockItem item) {
        finalLore.addAll(item.getReforge().getLore());
        return this;
    }

    public static List<String> cutLore(String descriptionString) {
        List<String> descriptionList = new ArrayList<>();
        String[] description = descriptionString.split("//");
        for (int i = 0; i < description.length; i++) {
            descriptionList.add(description[i]);
        }
        return descriptionList;
    }
}
