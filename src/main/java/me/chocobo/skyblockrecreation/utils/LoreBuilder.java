package me.chocobo.skyblockrecreation.utils;

import me.chocobo.skyblockrecreation.dataTypes.ItemStats;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockItem;
import me.chocobo.skyblockrecreation.enums.ItemType;
import me.chocobo.skyblockrecreation.enums.Reforge;

import java.util.ArrayList;
import java.util.List;

public class LoreBuilder {
    SkyblockItem item;
    List<String> tempLore;
    List<String> finalLore = new ArrayList<>();
    ItemType[] itemTypes = ItemType.values();

    public LoreBuilder(SkyblockItem item) {
        System.out.println("LoreBuilder.LoreBuilder 1");
        if (item.getType().equals(ItemType.MELEE) || item.getType().equals(ItemType.SWORD) || item.getType().equals(ItemType.ROD) || item.getType().equals(ItemType.BOW)) {
            System.out.println("LoreBuilder.LoreBuilder 2");
            addWeaponStats(item);
        }
        System.out.println("LoreBuilder.LoreBuilder 3");
        addEnchantments(item);
        if (item.getRune() != null) {
            System.out.println("LoreBuilder.LoreBuilder 4");
            addRune(item);
        }
        if (item.getReforge() != Reforge.DEFAULT) {
            System.out.println("LoreBuilder.LoreBuilder 5");
            addReforgeDescription(item);
        }
        System.out.println("LoreBuilder.LoreBuilder 6");
        if (!item.getLore().get(0).equals("")) {
            finalLore.addAll(item.getLore());
            finalLore.add("");
        }
        System.out.println("LoreBuilder.LorBuilder 7");

        if (item.getType() != ItemType.ACCESSORY || item.getType() != ItemType.NORMAL) {
            System.out.println("LoreBuilder.LoreBuilder 8");
            finalLore.add("§8This item can be reforged!");
        }
        System.out.println("LoreBuilder.LoreBuilder 9");
        finalLore.add(item.getRarity().getFormattingCode() + item.getRarity().getLoreMessage() + " " + item.getType().getLoreMessage());
        System.out.println("LoreBuilder.LoreBuilder 10");
    }



    private LoreBuilder addWeaponStats(SkyblockItem item) {
        System.out.println("LoreBuilder.addWeaponStats 1");
        ItemStats reforgeStats = item.getReforge().getStats().getStats(item.getRarity().getRarity());
        if (item == null) {
            System.out.println("LoreBuilder.addWeaponStats 2");
            System.out.println("item == null");
        }
        if (item.getStats() == null) {
            System.out.println("LoreBuilder.addWeaponStats 3");
            System.out.print("ItemStats == null");
        }
        System.out.println("LoreBuilder.addWeaponStats 4");
        finalLore.add("§7Damage: §c+" + item.getStats().getDamage());
        System.out.println("LoreBuilder.addWeaponStats 5");
        if (item.getStats().getStrength() != 0) finalLore.add("§7Strength: §c+" + item.getStats().getStrength());
        System.out.println("LoreBuilder.addWeaponStats 6");
        if (item.getHpb() != 0) {
            System.out.println("LoreBuilder.addWeaponStats 7");
            finalLore.set(0, finalLore.get(0) + " §e(+" + item.getHpb() * 2 + ")");
            System.out.println("LoreBuilder.addWeaponStats 8");
            finalLore.set(1, finalLore.get(1) + " §e(+" + item.getHpb() * 2 + ")");
            System.out.println("LoreBuilder.addWeaponStats 9");
        }
        if (item.getStats().getStrength() != 0) if (reforgeStats.getStrength() != 0) finalLore.set(finalLore.size()-1, finalLore.get(finalLore.size()-1) + " §9(" + item.getReforge().getName() + " " + reforgeStats.getStrength() + ")");
        System.out.println("LoreBuilder.addWeaponStats 10");
        if (item.getStats().getCritHit() != 0) {
            System.out.println("LoreBuilder.addWeaponStats 11");
            finalLore.add("§7Crit Chance: §c+" + item.getStats().getCritHit() + "%");
            System.out.println("LoreBuilder.addWeaponStats 12");
            if (reforgeStats.getStrength() != 0) finalLore.set(finalLore.size()-1, finalLore.get(finalLore.size()-1) + " §9(" + item.getReforge().getName() + " " + reforgeStats.getCritHit() + "%)");
            System.out.println("LoreBuilder.addWeaponStats 13");
        }
        if (item.getStats().getCritDamage() != 0) {
            System.out.println("LoreBuilder.addWeaponStats 14");
            finalLore.add("§7Crit Damage: §c+" + item.getStats().getCritDamage() + "%");
            System.out.println("LoreBuilder.addWeaponStats 15");
            if (reforgeStats.getCritDamage() != 0) finalLore.set(finalLore.size()-1, finalLore.get(finalLore.size()-1) + " §9(" + item.getReforge().getName() + " " + reforgeStats.getCritDamage() + "%)");
            System.out.println("LoreBuilder.addWeaponStats 16");
        }
        if (item.getStats().getAttackSpeed() != 0) {
            System.out.println("LoreBuilder.addWeaponStats 17");
            finalLore.add("§7Bonus Attack Speed: §c" + item.getStats().getAttackSpeed() + "%");
            System.out.println("LoreBuilder.addWeaponStats 18");
            if (reforgeStats.getAttackSpeed() != 0) finalLore.set(finalLore.size()-1, finalLore.get(finalLore.size()-1) + " §9(" + item.getReforge().getName() + " " + reforgeStats.getAttackSpeed() + "%)");
        }
        System.out.println("LoreBuilder.addWeaponStats 19");
        if (item.getStats().getIntelligence() != 0) {
            System.out.println("LoreBuilder.addWeaponStats 20");
            finalLore.add("");
            System.out.println("LoreBuilder.addWeaponStats 21");
            finalLore.add("§7Intelligence: §a+" + item.getStats().getIntelligence());
            System.out.println("LoreBuilder.addWeaponStats 22");
            if (reforgeStats.getIntelligence() != 0) finalLore.set(finalLore.size()-1, finalLore.get(finalLore.size()-1) + " §9(" + item.getReforge().getName() + " " + reforgeStats.getIntelligence() + ")");
        }
        System.out.println("LoreBuilder.addWeaponStats 23");
        finalLore.add("");
        System.out.println("LoreBuilder.addWeaponStats 24");
        return this;
    }

    private LoreBuilder addEnchantments(SkyblockItem item) {
        System.out.println("LoreBuilder.addEnchantments 1");
        finalLore.add("Enchantment list");
        System.out.println("LoreBuilder.addEnchantments 2");
        finalLore.add("");
        System.out.println("LoreBuilder.addEnchantements 3");
        return this;
    }

    private LoreBuilder addRune(SkyblockItem item) {
        System.out.println("LoreBuilder.addRune 1");
        finalLore.add(item.getRune().getName());
        System.out.println("LoreBuilder.addRune 2");
        finalLore.add(item.getRune().getDescription());
        System.out.println("LoreBuilder.addRune 3");
        return this;
    }

    private LoreBuilder addReforgeDescription(SkyblockItem item) {
        System.out.println("LoreBuilder.addReforgeDescription 1");
        finalLore.addAll(item.getReforge().getLore());
        System.out.println("LoreBuilder.addReforgeDescription 2");
        return this;
    }

    public List<String> build() {
        System.out.println("LoreBuilder.build 1");
        return finalLore;
    }

    public static List<String> cutLore(String descriptionString) {
        System.out.println("LoreBuilder.cutLore 1");
        List<String> descriptionList = new ArrayList<>();
        System.out.println("LoreBuilder.cutLore 2");
        String[] description = descriptionString.split("//");
        System.out.println("LoreBuilder.cutLore 3");
        for (int i = 0; i < description.length; i++) {
            System.out.println("LoreBuilder.cutLore 4 1 " + i);
            descriptionList.add(description[i]);
            System.out.println("LoreBuilder.cutLore 4 2 " + i);
        }
        System.out.println("LoreBuilder.cutLore 5");
        return descriptionList;
    }
}
